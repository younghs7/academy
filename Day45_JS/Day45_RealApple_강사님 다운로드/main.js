(()=>{

    let yOffset = 0;

    const sectionSet = [
        // section-0의 정보
        {
            height : 0,
            hMultiple : 5,
            objs : {
                container : document.querySelector('#section-0'),


            },



        }, 

        // section-1의 정보
        {
            height : 0,
            hMultiple : 7,
            objs : {
                container : document.querySelector('#section-1'),


            },

        }
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

            console.log('클라이언트 창 높이 : ' + window.innerHeight);
            console.log(i + '번째 섹션 높이 : ' + sectionSet[i].height);
            sectionSet[i].objs.container.style.height = `${sectionSet[i].height}px`;

        }

    }


    ////////////////////////////////////////////////////////////////////////
    // 이벤트 핸들러

    window.addEventListener('scroll', ()=>{

        yOffset = window.scrollY;

        console.log(yOffset);
        

    });


    window.addEventListener('load', ()=>{
        
        setLayout();

    });



})();