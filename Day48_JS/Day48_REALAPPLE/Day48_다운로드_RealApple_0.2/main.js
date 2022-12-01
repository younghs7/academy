(()=>{

    let yOffset = 0;            // 스크롤 위치값
    let currentSection = 0;     // 현재 섹션 번호
    let sectionYOffset = 0;

    const sectionSet = [
        // section-0의 정보
        {
            height : 0,
            hMultiple : 5,
            objs : {
                container : document.querySelector('#section-0'),
                messageA :  document.querySelector('.section0-message.a'),
                messageB :  document.querySelector('.section0-message.b'),
                messageC :  document.querySelector('.section0-message.c'),
                messageD :  document.querySelector('.section0-message.d'),


            },

            vals : {
                messageA_opacity_out : [0, 1, {start:0.05, end:0.14}],
                messageA_opacity_in  : [0, 1, {start:0.15, end:0.24}], 
                

            }


            

        }, 

        // section-1의 정보
        {
            height : 0,
            hMultiple : 2,
            objs : {
                container : document.querySelector('#section-1'),


            },

        },        
    ];

    ////////////////////////////////////////////////////////////////////////
    // 일반함수

    // Element의 크기, 위치등을 설정.
    const setLayout = function()
    {
        // section-0과 section-1의 높이를 설정한다.
        for (let i = 0; i < sectionSet.length; i++)
        {
            sectionSet[i].height = window.innerHeight * sectionSet[i].hMultiple;
            sectionSet[i].objs.container.style.height = `${sectionSet[i].height}px`;

        }

    }

    const getCurrentSection = function()   
    {
        let section = 0;

        let segment = [
            sectionSet[0].height,
            sectionSet[0].height + sectionSet[1].height            
        ];

        if (yOffset <= segment[0])
        {
            section = 0;
        }
        else if ((yOffset > segment[0]) &&
                 (yOffset <= segment[1]))
        {
            section = 1;
        }
        else 
        {
        

        }
        
        return section;

    }

    const setBodyID = function(section)
    {
        document.body.setAttribute('id', `show-section${section}`);

    }

    // 현재 섹션의 위에 있는 섹션의 높이합.
    const getPrevSectionHeight = function()
    {
        let prevHeight = 0;

        for (let i = 0; i < currentSection; i++)
        {
            prevHeight = prevHeight + sectionSet[i].height;

        }

        return prevHeight;
        
     
    }


    //messageA_opacity_out : [0, 1, {start:0.05, end:0.14}],
    const calcValue = function(values)
    {
        let result = 0;
        let rate = 0;
        const height = sectionSet[currentSection].height;

        let partStart;  // start 스크롤값 
        let partEnd;    // end 스크롤값
        let partHeight; // 높이


        if (values.length === 2)
        {
            // 1. 스크롤 비율 구한다.        
            rate = sectionYOffset / height;

            // 2. 비율에 따른 실제 적용할 CSS값을 계산한다.
            result = (rate * (values[1] - values[0])) + values[0];

        }
        else if (values.length === 3)
        {
            partStart = values[2].start * height;
            partEnd   = values[2].end * height;
            partHeight = partEnd - partStart;

            if (sectionYOffset < partStart)
            {
                result = values[0];
            
            }
            else if (sectionYOffset > partEnd)
            {
                result = values[1];

            }
            else
            {
                rate = (sectionYOffset - partStart) / partHeight;
                result = (rate * (values[1] - values[0])) + values[0];

            }

        }

        return result;      


    }

    const playAnimation = function()
    {
        let value;

        let scrollRate = sectionYOffset / sectionSet[currentSection].height;
        let objects = sectionSet[currentSection].objs;

        switch(currentSection)
        {
            case 0:

                if (scrollRate <= 0.25)
                {
                    value = calcValue(sectionSet[currentSection].vals.messageA_opacity_in);
                    objects.messageA.style.opacity = value;
                    
                    


                }
                else if ((scrollRate > 0.25) && (scrollRate <= 0.5))
                {
                    console.log('message-B를 애니메이션 시킨다.')

                }
                else if ((scrollRate > 0.5) && (scrollRate <= 0.75))
                {
                    console.log('message-C를 애니메이션 시킨다.');
                }
                else if ((scrollRate > 0.75) && (scrollRate <= 1))
                {
                    console.log('message-D를 애니메이션 시킨다.');
                }
                
                break;


            case 1:
                //2. 스크롤값에따라 적용해야할 CSS값을 계산한다.
                //3 계산된 결과를 적용.
                console.log(scrollRate);

    
            break;


        }

    }

    

    ////////////////////////////////////////////////////////////////////////
    // 이벤트 핸들러

    window.addEventListener('scroll', ()=>{

        yOffset = window.scrollY;

        // 현재 섹션값 및 섹션내에서의 yoffset값을 구한다.
        currentSection = getCurrentSection();     
        sectionYOffset = yOffset - getPrevSectionHeight();
        
        
        setBodyID(currentSection)


        playAnimation();
        

    });


    window.addEventListener('load', ()=>{     
        setLayout();

        
    });


})();