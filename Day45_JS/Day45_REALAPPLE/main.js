(()=>{

    let yOffset = 0;

    const sectionSet = [    // 섹션 정보는 only one이기 때문에 oject literal로 작성한다.
        // section-0의 정보들
        {
            height : 0,       // 클라이언트에 맞춰야 하는데, 클라이언트는 pc, 모바일 여러가지 때문에 화면크기 배수로 처리해야한다.
            hMultiple : 5,    
            objs : {
                container : document.querySelector('#section-0')
            }
        }, 
        // setion-1의 정보
        {
            height : 0,
            hMultiple : 5,
            objs : {
                container : document.querySelector('#section-1')
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

    ///////////////////////////////////////////////////////////////////////////////////////
    // 이벤트 핸들러



    // 스크롤은 BOM이지만 BOM에는 메시지를 못 붙여서 window에 붙인다.
    window.addEventListener('scroll', ()=>{

        console.log(window.scrollY) // 스크롤값은 px값과 일치한다. 
                                       // scrollY 최대값(px) + 디스플레이 높이값(px) = 문서의 길이(px) 

        yOffset = window.scrollY;


    });


    // 모든 리소스를 가져온 시점에 section 높이를 설정하는 게 좋다.
    // load : 모든 리소스를 가져오고, 화면에 뿌리기 직전
    window.addEventListener('load', ()=>{
        // section-0 하고, section1하고의 높이를 설정한다.
        setLayout();

    });


})();