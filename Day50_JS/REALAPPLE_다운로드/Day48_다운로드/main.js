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
                messageA_opacity : [1, 0],
                messageA_translateY : [300, -500]

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

    const calcValue = function(values)
    {
        let result = 0;
        let rate = 0;
        const height = sectionSet[currentSection].height;

        // 1. 스크롤 비율 구한다.        
        rate = sectionYOffset / height;

        // 2. 비율에 따른 실제 적용할 CSS값을 계산한다.
        result = (rate * (values[1] - values[0])) + values[0];



        return result;      


    }

    const playAnimation = function()
    {
        let value;

        switch(currentSection)
        {
            case 0:

                //sectionSet[0].objs.messageA.style.color = 'red';
                //opacity 1--->0

                
                //2. 스크롤값에따라 적용해야할 CSS값을 계산한다.
                // 20, 50
                value = calcValue(sectionSet[currentSection].vals.messageA_translateY);
                console.log('value = ' + value);
                //3 계산된 결과를 적용.
                //sectionSet[currentSection].objs.messageA.style.opacity = value;



                break;


            case 1:
                //2. 스크롤값에따라 적용해야할 CSS값을 계산한다.
                //3 계산된 결과를 적용.

    
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

        console.log("시작값" + sectionSet[0].vals.messageA_opacity[0]);
        console.log("종료값" + sectionSet[0].vals.messageA_opacity[1]);
        console.log("Y시작값" + sectionSet[0].vals.messageA_translateY[0]);
        console.log("Y종료값" + sectionSet[0].vals.messageA_translateY[1]);
    });


})();