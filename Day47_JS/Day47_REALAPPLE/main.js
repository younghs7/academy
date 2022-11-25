(()=>{

    let yOffset = 0;          // 스크롤 위치값
    let currentSection = 0;   // 현재 섹션 번호


    const sectionSet = [    // 섹션 정보는 only one이기 때문에 oject literal로 작성한다.
        // section-0의 정보들
        {
            height : 0,       // 클라이언트에 맞춰야 하는데, 클라이언트는 pc, 모바일 여러가지 때문에 화면크기 배수로 처리해야한다.
            hMultiple : 2,    
            objs : {
                container : document.querySelector('#section-0')
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


    const setBodyID = function(section)
    {
        document.body.setAttribute('id', `show-section${section}`)
    }



    ///////////////////////////////////////////////////////////////////////////////////////
    // 이벤트 핸들러



    // 스크롤은 BOM이지만 BOM에는 메시지를 못 붙여서 window에 붙인다.
    window.addEventListener('scroll', ()=>{

       

        console.log(window.scrollY) // 스크롤값은 px값과 일치한다. 
                                       // scrollY 최대값(px) + 디스플레이 높이값(px) = 문서의 길이(px) 

        yOffset = window.scrollY;


        //현재 섹션값을 가지고 온 다음
        currentSection = getCurrnetSection();

        // 그 값으로 바디 태그에 show-section0 이런식으로 id를 달아준다.
        setBodyID(currentSection);


    });


    // 모든 리소스를 가져온 시점에 section 높이를 설정하는 게 좋다.
    // load : 모든 리소스를 가져오고, 화면에 뿌리기 직전
    window.addEventListener('load', ()=>{
        // section-0 하고, section1하고의 높이를 설정한다.
        setLayout();

    });


})();