(()=>{


    // 변수 설정 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ



    let yOffset = 0;          // 스크롤 위치값
    let currentSection = 0;   // 현재 섹션 번호
    let sectionYOffset = 0;


    const sectionSet = [    // 섹션 정보는 only one이기 때문에 oject literal로 작성한다.
        // section-0의 정보들
        {
            height : 0,       // 클라이언트에 맞춰야 하는데, 클라이언트는 pc, 모바일 여러가지 때문에 화면크기 배수로 처리해야한다.
            hMultiple : 5,    
            objs : {
                container : document.querySelector('#section-0'),
                messageA : document.querySelector('.section0-message.a'),  // 띄어쓰기(자손) >(자식) ,(여러개) 붙여쓰기(조건) 4가지 가능
                messageB : document.querySelector('.section0-message.b'),
                messageC : document.querySelector('.section0-message.c'),
                messageD : document.querySelector('.section0-message.d')
            },

            vals : {
                messageA_opacity_in : [0, 1, {start: 0.05, end: 0.14 }],
                messageA_opacity_out : [1, 0, {start: 0.15, end: 0.24 } ]

            }

            
        }, 
        // setion-1의 정보
        {
            height : 0,
            hMultiple : 2,
            objs : {
                container : document.querySelector('#section-1')
            }

        },
        // section-2의 정보
        {
            height : 0,
            hMultiple : 2,
            objs : {
                container : document.querySelector('#section-2')
            }

        }



    ];     



    ///////////////////////////////////////////////////////////////////////////////////////
    // 일반함수


    // Element의 크기, 위치 등을 설정
    const setLayout = function()
    {

        // section-0 하고, section1하고의 높이를 설정한다.
        for(let i = 0; i < sectionSet.length; i++)
        {   
           
            sectionSet[i].height = window.innerHeight * sectionSet[i].hMultiple;
            sectionSet[i].objs.container.style.height = `${sectionSet[i].height}px`;
        
            console.log('클라이언트 창 높이: ' + window.innerHeight);
            console.log(i + '번째 섹션 높이: ' + sectionSet[i].height );
        
        }

        // section-0 하고, section1하고의 높이를 설정한다.
        sectionSet[0].height = window.innerHeight * sectionSet[0].hMultiple;      

        const sec0 = document.querySelector('#section-0');
        sec0.style.height = `${sectionSet[0].height}px`;

    }

    // window.innerHeight - 실제 웹창의 높이 px을 리턴해줌



    // ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

    let section0LastYOffset =  sectionSet[0].height;
    let section1LastYOffset =  sectionSet[0].height + sectionSet[1].height;
    let section2LastYOffset =  sectionSet[0].height + sectionSet[1].height + sectionSet[2].height;

    const getCurrnetSection = function()
    {
        //현재 스크롤 위치값(yOffset)이 
        // section-0의 위치에 있는지?  ==> return 0
        // section-1의 위치에 있는지?  ==> return 1
        // section-2의 위치에 있는지?  ==> return 2
        // 판단해서 해당위치의 값을 리턴한다.
        
     
        // 내가 푼 것 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

        // if(0 <= yOffset  && yOffset <= section0LastYOffset )
        // {
        //     console.log(0);
        //     return 0;
        // }

        // if(section0LastYOffset < yOffset  && yOffset <= section1LastYOffset )
        // {
        //     console.log(1);
        //     return 1;
        // }

        // if(section1LastYOffset < yOffset  && yOffset <= section2LastYOffset )
        // {
        //     console.log(2);
        //     return 2;
        // }

        // 풀이 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        let section = 0;

        let segment = [
            sectionSet[0].height,
            sectionSet[0].height + sectionSet[1].height,

        ]

        if(yOffset <= segment[0])
        {
            section = 0;
        }
        else if( ( yOffset > segment[0]) &&
                 ( yOffset < segment[1]) )
        {
            section = 1;
        }
        else
        {
            
        }

        return section;

    }

    // ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ


    const setBodyID = function(section)
    {
        document.body.setAttribute('id', `show-section${section}`)
    }


    // ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ


    // 현재 섹션의 위에 있는 섹션의 높이합.
    const getPrevSectionHeight = function()
    {   

        // 문제
        // 현재 섹션이 0 ==> 0
        // 현재 섹션이 1 ==> section0의 높이
        // 현재 섹션이 2 ==> section0의 높이 + section1의 높이
        
        let prevHeight = 0;
        for(let i = 0; i < currentSection; i++ )
        {
            prevHeight = prevHeight + sectionSet[i].height;
        }

        return prevHeight;
        

    }

    // ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

    const calcValue = function(values)
    {  
        let result = 0; 
        let rate = 0;
        const height = sectionSet[currentSection].height;

        let partStart; // star  실제 스크롤값
        let partEnd; // end 실제 스크롤값
        let partHeight; // 실제 높이값

        if( values.length === 2)
        {
            //1. 스크롤 비율 구한다.
            rate = sectionYOffset / height;
    
            //2. 비율에 따른 실제 적용할 CSS값을 계산한다.
           result = values[0] + rate * (values[1] - values[0]);
           
           
        }
        else if( values.length === 3)
        {   
            partStart = values[2].start * height;
            partEnd = values[2].end * height;
            partHeight = partEnd - partStart;

            rate = (sectionYOffset - partStart) / partHeight
            
            // console.log('partStart = ' + partStart);
            // console.log('partEnd = ' + partEnd);
            // console.log('partHeight = ' + partHeight);
            // console.log('rate = ' + rate);

            // if(sectionYOffset < partStart)
            // {
            //     result = values[0];
            // }
            // else if( sectionYOffset >partEnd)
            // {
            //     result = values[1];
            // }
            // else
            // {
            //     result = (rate * (values[1] - values[0])) + values[0];
            // }
            

            //1. 시작부터 끝의 길이를 구한다.
            let Newheight =  ( values[2].end - values[2].start ) * height;
           
            console.log('height:   ' + height)

            //2. 길이 내의 현재 비율을 구한다.
            let offset = sectionYOffset - ( height * values[2].start );
      
            rate = offset / Newheight;

            result = values[0] + rate * (values[1] - values[0]);

        }

        return result;

    }


    // ㅡ 문제 내가 품 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
    // const CalcValue2 = function(range)
    // {
    //    let rate = sectionYOffset / sectionSet[currentSection].height ;

    //    let opacity = range[0] + rate * (range[1] - range[0]);
       
    //    return opacity;
    // }
    // ====================================================


    // ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ


    const playAnimation = function()
    {
        let value;

        let scrollRate = sectionYOffset / sectionSet[currentSection].height;
        let objects = sectionSet[currentSection].objs;

        console.log(scrollRate,scrollRate)

        switch(currentSection)
        {
            case 0:
                if(scrollRate <= 0.25)
                {
                  
                    // value = calcValue(sectionSet[currentSection].vals.messageA_opacity_in)
                    // objects.messageA.style.opacity = value;

                    if(scrollRate >= sectionSet[0].vals.messageA_opacity_in[2].start)
                    {
                        value =  calcValue(sectionSet[0].vals.messageA_opacity_in);
                        // console.log('value     '+ value);
                    }
                    if(scrollRate >= sectionSet[0].vals.messageA_opacity_out[2].start)
                    {
                        value =  calcValue(sectionSet[0].vals.messageA_opacity_out);
                        // console.log('value     '+ value);
                    }
                    
                   
                }
                if ( (scrollRate > 0.25) && (scrollRate <= 0.5) )
                {
                    console.log('messageb를 애니메이션')
                }
                else if( (scrollRate > 0.5) && (scrollRate <= 0.75) )
                {
                    console.log('messagec를 애니메이션')
                }
                else if ( (scrollRate > 0.75) && (scrollRate <= 1) )
                {
                    console.log('messaged를 애니메이션')
                }
                // opacity 1 ---> 0

                //1. messageA의 엘리먼트를 가지고 온다.
                //2. 스크롤값에 따라 적용해야할 CSS값을 계산한다.

            
                //3. 계산된 결과를 적용.
                sectionSet[0].objs.messageA.style.opacity = value;
                console.log('sectionSet[0].objs.messageA.style.opacity:    ', sectionSet[0].objs.messageA.style.opacity)

            break;
               
            case 1:

            break;    
        }
    }



    ///////////////////////////////////////////////////////////////////////////////////////
    // 이벤트 핸들러



    // 스크롤은 BOM이지만 BOM에는 메시지를 못 붙여서 window에 붙인다.
    window.addEventListener('scroll', ()=>{


        console.log(window.scrollY) // 스크롤값은 px값과 일치한다. 
                                       // scrollY 최대값(px) + 디스플레이 높이값(px) = 문서의 길이(px) 

        yOffset = window.scrollY;


        //현재 섹션값을 및 섹션내에서의 yoffset값을 구한다.
        currentSection = getCurrnetSection();
        sectionYOffset = yOffset - getPrevSectionHeight();

        // 그 값으로 바디 태그에 show-section0 이런식으로 id를 달아준다.
        setBodyID(currentSection);

        playAnimation();

    });


    // 모든 리소스를 가져온 시점에 section 높이를 설정하는 게 좋다.
    // load : 모든 리소스를 가져오고, 화면에 뿌리기 직전
    window.addEventListener('load', ()=>{
        // section-0 하고, section1하고의 높이를 설정한다.
        setLayout();


    });


})();