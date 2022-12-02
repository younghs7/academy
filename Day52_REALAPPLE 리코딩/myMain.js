

(()=>{


    let currentSection = 0;
    let sectionScrollY = 0;
    let currentSectionScrollRate = 0; 
    
    const nav1 = {
        reference : document.body.querySelector('.nav1')
        
    }
    console.log('nav1.reference.clientHeight', nav1.reference.clientHeight);
   
    const sections = [

        // text0

        // section 0 정보
        {
            reference : document.body.querySelector('.section0'),
            height : 0,
            innerHeightMultiple : 9,
            bottomScrollY : 0,
            topScrollY : 0,    

            stickyElements : document.body.querySelectorAll('.stickyElement.text'),
            
            texts : [
                // text0
                {
                    reference : document.body.querySelector('.text0'),
                    fadeInOpacity : [0, 1, {startRate:0.00, endRate:0.08}],
                    fadeOutOpacity : [1, 0, {startRate:0.08, endRate:0.16}],
                    fadeOut_translateY : [0, -300, {startRate:0.08, endRate:0.16}]
                },
                // text1
                {
                    reference : document.body.querySelector('.text1'),
                    fadeInOpacity : [0, 1, {startRate:0.16, endRate:0.24}],
                    fadeOutOpacity : [1, 0, {startRate:0.24, endRate:0.32}],
                    fadeOut_translateY : [0, -300, {startRate:0.24, endRate:0.32}]
                },
                // text2
                {
                    reference : document.body.querySelector('.text2'),
                    fadeInOpacity : [0, 1, {startRate:0.32, endRate:0.40}],
                    fadeOutOpacity : [1, 0, {startRate:0.40, endRate:0.48}],
                    fadeOut_translateY : [0, -300, {startRate:0.40, endRate:0.48}]
                },
                // text3
                {
                    reference : document.body.querySelector('.text3'),
                    fadeInOpacity : [0, 1, {startRate:0.48, endRate:0.56}],
                    fadeOutOpacity : [1, 0, {startRate:0.56, endRate:0.64}],
                    fadeOut_translateY : [0, -300, {startRate:0.56, endRate:0.64}]
                },
                // text4
                {
                    reference : document.body.querySelector('.text4'),
                    fadeInOpacity : [0, 1, {startRate:0.64, endRate:0.72}],
                    fadeOutOpacity : [1, 0, {startRate:0.72, endRate:0.9}],
                    fadeOut_translateY : [0, -300, {startRate:0.72, endRate:0.9}]
                }

            ],


            //나중에 text 배열로 만들자. 이렇게 만들면 일일히 하나하나 지정해줘야되서 피곤하네.
            text0 : {
                reference : document.body.querySelector('.text0'),
                fadeInOpacity : [0, 1, {startRate:0.00, endRate:0.08}],
                fadeOutOpacity : [1, 0, {startRate:0.08, endRate:0.16}],
                fadeOut_translateY : [0, -300, {startRate:0.08, endRate:0.16}]
            },
            text1 : {
                reference : document.body.querySelector('.text1'),
                fadeInOpacity : [0, 1, {startRate:0.16, endRate:0.24}],
                fadeOutOpacity : [1, 0, {startRate:0.24, endRate:0.32}],
                fadeOut_translateY : [0, -300, {startRate:0.24, endRate:0.32}]
            },
            text2 : {
                reference : document.body.querySelector('.text2'),
                fadeInOpacity : [0, 1, {startRate:0.32, endRate:0.40}],
                fadeOutOpacity : [1, 0, {startRate:0.40, endRate:0.48}],
                fadeOut_translateY : [0, -300, {startRate:0.40, endRate:0.48}]
            },
            text3 : {
                reference : document.body.querySelector('.text3'),
                fadeInOpacity : [0, 1, {startRate:0.48, endRate:0.56}],
                fadeOutOpacity : [1, 0, {startRate:0.56, endRate:0.64}],
                fadeOut_translateY : [0, -300, {startRate:0.56, endRate:0.64}]
            },
            text4 : {
                reference : document.body.querySelector('.text4'),
                fadeInOpacity : [0, 1, {startRate:0.64, endRate:0.72}],
                fadeOutOpacity : [1, 0, {startRate:0.72, endRate:0.9}],
                fadeOut_translateY : [0, -300, {startRate:0.72, endRate:0.9}]
            },

            images : {
                count : 500,
                references : [],
                
                
            },

            canvas : {
                reference : document.body.querySelector('.section0-canvas'),
                context2d : document.body.querySelector('.section0-canvas').getContext('2d'),
                opacityRange : [1, 0, {startRate:0.7, endRate:0.9}]
            }



        },
        // section1 정보
        {
            reference : document.body.querySelector('.section1'),
            height : 0,
            innerHeightMultiple : 5,
            bottomScrollY : 0,
            topScrollY : 0,   

            video : {
                reference : document.body.querySelector('video'),
                opacityRange : [1, 0, {startRate:0, endRate:0.2}]
            }

        },

    ];

    


    console.log(sections[0].text0)



    // 일반함수 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ



    const setSectionHeight = function()
    {   
        //section 높이 설정
        for(let i = 0; i < sections.length; i++)
        {
            //js 설정
            sections[i].height =  window.innerHeight * sections[i].innerHeightMultiple;
            //css 설정
            sections[i].reference.style.height = `${sections[i].height}px`;
        }

        //section0 stickyElement 위치 설정
        const stickys = sections[0].stickyElements;
        for(const Elem of stickys)
        {
            Elem.style.top = `${window.innerHeight / 2}px`;
        }
        
    }




    const getCurrentSection = function()
    {
        let section = 0;
        let sectionEndLocation = [];
        let total = 0;

        // 각 section 하단 스크롤 위치를 배열로 저장함.
        for(let i = 0; i < sections.length; i++)
        {   
            total = total + sections[i].height;
            sectionEndLocation.push(total);
        }
            // console.log('sectionEndLocation', sectionEndLocation);
        
        section = 0;
        for(let i = 0; i < sections.length; i++)
        {   
            if(window.scrollY <= sectionEndLocation[i])
            {
                return section;
            }
            section++;
        }

        // 무언가 로직이 잘못되었다면
        return -1;

    }

    const setSectionBottomTopScrollY = function()
    {
        let SectionBottomScrollY = 0;
        let SectionTopScrollY = 0;
        for(let i = 0; i < sections.length; i++)
        {   
            sections[i].topScrollY = SectionBottomScrollY;
            SectionBottomScrollY = SectionBottomScrollY + sections[i].height;
            sections[i].bottomScrollY = SectionBottomScrollY;
        }
    }




    // 현재 section top부분을 SectionScrollY = 0 으로 둠.
    const setSectionScrollY = function()
    {   
        let currentSectionTopScrollY = sections[currentSection].topScrollY;

        // 현재 섹션에서의 top을 0으로 하는 scrollY값으로 변환함.
        sectionScrollY = window.scrollY - currentSectionTopScrollY; 

    }


    // 현재 section 위치에 따라 Body 아이디 변경
    const setBodyID = function()
    {
    document.body.setAttribute('id', `show-section${currentSection}`) 
    }



    const calcValueBySectionScrollY = function(range)
    {   
        let CalculatedValue = 0;
        currentSectionScrollRate = sectionScrollY / sections[currentSection].height;        
        
        if(range.length === 2)
        {
            CalculatedValue = range[0] + ( range[1] - range[0] ) * currentSectionScrollRate;
            
            return CalculatedValue;
        }
        else if(range.length === 3)
        {   
            // 필요 요소: 시작 위치, 끝 위치, 시작-끝 길이 
            
            let currentSectionHeight = sections[currentSection].height;

            // start-end scrollY값 위치를 찾는다.
            let startY = range[2].startRate * currentSectionHeight;
            let endY = range[2].endRate * currentSectionHeight;

            
            let height = endY - startY;  
            let localY = sectionScrollY - startY;
            let rate = localY / height;

            if(rate < 0)
                rate = 0;
            if(rate > 1)
                rate = 1;   

                // console.log('rate:', rate);

            CalculatedValue =  range[0] + ( range[1] - range[0] ) * rate;
                // console.log('CalculatedValue:', CalculatedValue)
            

            return CalculatedValue;
        }

        
        
    }

 
    
    const playAnimation = function()
    {
        let value = 0;
        switch(currentSection)
        {
            case 0:

                sections[0].text0.reference.style.opacity = 0;
                sections[0].text1.reference.style.opacity = 0;
                sections[0].text2.reference.style.opacity = 0;
                sections[0].text3.reference.style.opacity = 0;
                sections[0].text4.reference.style.opacity = 0;

                currentSectionScrollRate = sectionScrollY / sections[0].height;
                        // console.log('currentSectionScrollRate', currentSectionScrollRate)

                
                //image
                if( (0.7 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.9))
                {
                    value = calcValueBySectionScrollY(sections[0].canvas.opacityRange);
                    sections[0].canvas.reference.style.opacity = value;
                } 


                // // for문으로 교체
                // let textCount = sections[0].texts.length;
                // for(let i = 0; i < textCount; i++)
                // {
                //     if( (0.08 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.16))
                //     {

                //         break;
                //     } 
                // } 어차피 바꿀 건데, 만들어서 뭐해
                

                
                // text0
                if(currentSectionScrollRate <= 0.08)
                {
                    value = calcValueBySectionScrollY(sections[0].text0.fadeInOpacity);
                    sections[0].text0.reference.style.opacity = value;

                }
                else if( (0.08 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.16))    
                {
                    value = calcValueBySectionScrollY(sections[0].text0.fadeOutOpacity);
                    sections[0].text0.reference.style.opacity = value;
                    
                    value = calcValueBySectionScrollY(sections[0].text0.fadeOut_translateY);
                         // console.log('transform:', value);
                    sections[0].text0.reference.style.transform = `translateY(${value}%)`
                }
                // text1
                else if( (0.16 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.24))    
                {
                    value = calcValueBySectionScrollY(sections[0].text1.fadeInOpacity);
                    sections[0].text1.reference.style.opacity = value;
                    
                }
                else if( (0.24 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.32))    
                {
                    value = calcValueBySectionScrollY(sections[0].text1.fadeOutOpacity);
                    sections[0].text1.reference.style.opacity = value;

                    value = calcValueBySectionScrollY(sections[0].text1.fadeOut_translateY);
                    sections[0].text1.reference.style.transform = `translateY(${value}%)`
                    
                }

                //text2
                else if( (0.32 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.4))    
                {
                    value = calcValueBySectionScrollY(sections[0].text2.fadeInOpacity);
                    sections[0].text2.reference.style.opacity = value;

                }
                else if( (0.4 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.48))    
                {
                    value = calcValueBySectionScrollY(sections[0].text2.fadeOutOpacity);
                    sections[0].text2.reference.style.opacity = value;
                    
                    value = calcValueBySectionScrollY(sections[0].text2.fadeOut_translateY);
                    sections[0].text2.reference.style.transform = `translateY(${value}%)`

                }
                // text3
                else if( (0.48 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.56))    
                {
                    value = calcValueBySectionScrollY(sections[0].text3.fadeInOpacity);
                    sections[0].text3.reference.style.opacity = value;
                    
                }
                else if( (0.56 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.64))    
                {
                    value = calcValueBySectionScrollY(sections[0].text3.fadeOutOpacity);
                    sections[0].text3.reference.style.opacity = value;

                    value = calcValueBySectionScrollY(sections[0].text3.fadeOut_translateY);
                    sections[0].text3.reference.style.transform = `translateY(${value}%)`
                    
                }

                //text4
                else if( (0.64 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.72))    
                {
                    value = calcValueBySectionScrollY(sections[0].text4.fadeInOpacity);
                    sections[0].text4.reference.style.opacity = value;
                    
                }
                else if( (0.72 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.9))    
                {
                    value = calcValueBySectionScrollY(sections[0].text4.fadeOutOpacity);
                    sections[0].text4.reference.style.opacity = value;

                    value = calcValueBySectionScrollY(sections[0].text4.fadeOut_translateY);
                    sections[0].text4.reference.style.transform = `translateY(${value}%)`
                    
                }
                
                    // console.log('opacity:', value)

                break;
            
            default :
                break;

        }

            //  console.log('sections[0].text0.reference.style.opacity:', sections[0].text0.reference.style.opacity)
    }


    const setImages = function()
    {   let count = sections[0].images.count;
        let images =sections[0].images.references;


        let imageElement;

        for(let i = 0; i < count; i++)
        {
            imageElement = new Image();
            imageElement.src = `../image/apple_${i}.png`;

            images.push(imageElement);
        }

        imageElement.addEventListener('load', ()=>{

            sections[0].canvas.context2d.drawImage(images[0], 0, 0)


        });

    }

   
    
   
    

    // 이벤트리스너 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

    window.addEventListener('load', ()=>{

        
        setSectionHeight();
        setSectionBottomTopScrollY();

        console.log('window.innerHeight: ',window.innerHeight)
        console.log('document.body.scrollHeight:', document.body.scrollHeight)
        
        setImages();

        

    });
    
    // 스크롤 할 때 마다
    window.addEventListener('scroll', ()=>{
        
        
        //현재 섹션 위치 갱신함.
        currentSection = getCurrentSection();
        
        //섹션 위치에 따라 바디 ID를 바꿈.
        setBodyID();

        //sectionScrollY 갱신함.
        setSectionScrollY();

        //스크롤값과 상호작용하여 애니메이션 동작함. 
        playAnimation();
        
        // 캔버스에 이미지 그리기
        let imageIndex = Math.floor( calcValueBySectionScrollY([0, 499]) );
        sections[0].canvas.context2d.drawImage(sections[0].images.references[imageIndex],0,0);


        // nav1 스크롤 내리면 fixed로 바꾸기
        console.log(window.scrollY)
        if (window.scrollY >= 48) 
        {
            nav1.reference.classList.add('nav1-makeFixed');

        }
        else
        {
            nav1.reference.classList.remove('nav1-makeFixed');

        }


        // if(scrollY > )

                                // console.log('sectionScrollY', sectionScrollY)

                                // console.log('window.scrollY:', window.scrollY);

                                // console.log('currentSection', currentSection)

    });


})();