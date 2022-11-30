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
                messageA_opacity_in  : [1, 0, {start:0.15, end:0.24}], 

                messageA_translateY_out : [0, -40, {start:0.05, end:0.14}],

                messageB_opacity_out : [0, 1, {start:0.25, end:0.34}],
                messageB_opacity_in  : [1, 0, {start:0.35, end:0.44}], 

                messageC_opacity_out : [0, 1, {start:0.45, end:0.54}],
                messageC_opacity_in  : [1, 0, {start:0.55, end:0.64}], 

                messageD_opacity_out : [0, 1, {start:0.65, end:0.74}],
                messageD_opacity_in  : [1, 0, {start:0.75, end:0.84}], 


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
            //messageA_opacity_out : [0, 1, {start:0.05, end:0.14}],
            
            // 시작위치의 실제 스크롤값.
            partStart = values[2].start * height;

            // 끝나는 위치의 실제 스크롤값.
            partEnd   = values[2].end * height;

            
            partHeight = partEnd - partStart;

            // 스크롤값이 시작위치 이전인경우 values[0]을 확장해서 적용
            if (sectionYOffset < partStart)
            {
                result = values[0];
            
            }
            // 스크롤값이 끝나는값 이후인경우 values[1]을 확장해서 적용
            else if (sectionYOffset > partEnd)
            {
                result = values[1];

            }
            else
            {
                // 부분영역에서 얼만큼 진행했는지 비율 구한다.
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
        let values = sectionSet[currentSection].vals;

        switch(currentSection)
        {
            case 0:
                objects.messageA.style.opacity = 0;
                objects.messageB.style.opacity = 0;
                objects.messageC.style.opacity = 0;
                objects.messageD.style.opacity = 0;                    


                if (scrollRate <= 0.15)
                {                 
                    value = calcValue(values.messageA_opacity_out);
                    objects.messageA.style.opacity = value;

                    value = calcValue(values.messageA_translateY_out);
                    objects.messageA.style.transform = `translateY(${value}%)`;

                    console.log('ty = ' + value);
                    
                }
                else if ((scrollRate > 0.15) && (scrollRate < 0.25))
                {
                    value = calcValue(values.messageA_opacity_in);
                    objects.messageA.style.opacity = value;

                }
                else if ((scrollRate >= 0.25) && (scrollRate < 0.35))
                {
                    value = calcValue(values.messageB_opacity_out);
                    objects.messageB.style.opacity = value;                    
                    

                }
                else if ((scrollRate >= 0.35) && (scrollRate < 0.45))
                {
                    value = calcValue(values.messageB_opacity_in);
                    objects.messageB.style.opacity = value;                    
                }
                else if ((scrollRate >= 0.45) && (scrollRate < 0.55))
                {
                    value = calcValue(values.messageC_opacity_out);
                    objects.messageC.style.opacity = value;                    

                }
                else if ((scrollRate >= 0.55) && (scrollRate < 0.65))
                {

                    value = calcValue(values.messageC_opacity_in);
                    objects.messageC.style.opacity = value;                    


                }
                else if ((scrollRate >= 0.65) && (scrollRate < 0.75))
                {
                    value = calcValue(values.messageD_opacity_out);
                    objects.messageD.style.opacity = value;                    


                }
                else if ((scrollRate >= 0.75) && (scrollRate < 0.85))
                {

                    value = calcValue(values.messageD_opacity_in);
                    objects.messageD.style.opacity = value;                    



                }
                else
                {
                    objects.messageA.style.opacity = 0;
                    objects.messageB.style.opacity = 0;
                    objects.messageC.style.opacity = 0;
                    objects.messageD.style.opacity = 0;                    

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