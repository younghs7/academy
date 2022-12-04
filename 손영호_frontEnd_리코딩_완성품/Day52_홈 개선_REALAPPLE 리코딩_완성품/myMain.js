

(()=>{

    // 전역 변수 설정 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

    let currentSection = 0;
    let sectionScrollY = 0;
    let currentSectionScrollRate = 0; 
    
    const nav1 = {
        reference : document.body.querySelector('.nav1')
        
    }
    
    const sections = [

        // section 0 정보
        {
            reference : document.body.querySelector('.section0'),
            height : 0,
            innerHeightMultiple : 9,
            bottomScrollY : 0,
            topScrollY : 0,    

            
            
            texts : [
                // text0
                {
                    reference : document.body.querySelector('.section0 > .text0'),
                    fadeInOpacity : [0, 1, {startRate:0.00, endRate:0.08}],
                    fadeOutOpacity : [1, 0, {startRate:0.08, endRate:0.16}],
                    fadeOut_translateY : [0, -300, {startRate:0.08, endRate:0.16}]
                },
                // text1
                {
                    reference : document.body.querySelector('.section0 > .text1'),
                    fadeInOpacity : [0, 1, {startRate:0.16, endRate:0.24}],
                    fadeOutOpacity : [1, 0, {startRate:0.24, endRate:0.32}],
                    fadeOut_translateY : [0, -300, {startRate:0.24, endRate:0.32}]
                },
                // text2
                {
                    reference : document.body.querySelector('.section0 > .text2'),
                    fadeInOpacity : [0, 1, {startRate:0.32, endRate:0.40}],
                    fadeOutOpacity : [1, 0, {startRate:0.40, endRate:0.48}],
                    fadeOut_translateY : [0, -300, {startRate:0.40, endRate:0.48}]
                },
                // text3
                {
                    reference : document.body.querySelector('.section0 > .text3'),
                    fadeInOpacity : [0, 1, {startRate:0.48, endRate:0.56}],
                    fadeOutOpacity : [1, 0, {startRate:0.56, endRate:0.64}],
                    fadeOut_translateY : [0, -300, {startRate:0.56, endRate:0.64}]
                },
                // text4
                {
                    reference : document.body.querySelector('.section0 > .text4'),
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
                reference : document.body.querySelector('.section0-canvasDiv-canvas'),
                context2d : document.body.querySelector('.section0-canvasDiv-canvas').getContext('2d'),
                opacityRange : [1, 0, {startRate:0.7, endRate:0.9}]
            }



        },
        // section1 정보
        {
            reference : document.body.querySelector('.section1'),
            height : 0,
            innerHeightMultiple : 10,
            bottomScrollY : 0,
            topScrollY : 0,   

            video : {
                reference : document.body.querySelector('.seciont1-videoDiv-video'),
                opacityRange : [0, 1, {startRate:0, endRate:0.2}]
            }

        },

       

    ];

    const footElem = document.querySelector('footer');

    


    console.log(sections[0].text0)

    console.log('nav1.reference.clientHeight', nav1.reference.clientHeight);
    console.log('text0:',sections[0].texts[0].reference)
    console.log('text1:',sections[0].texts[1].reference)
    console.log('text2:',sections[0].texts[2].reference)
    console.log('text3:',sections[0].texts[3].reference)
    console.log('text4:',sections[0].texts[4].reference)
    console.log('sections[0].texts[0].reference', sections[0].texts[0].reference)
    console.log('sections[0].canvas.reference:', sections[0].canvas.reference)
    console.log('sections[1].video.reference:',sections[1].video.reference)

    for(const index in sections[0].texts)
    {
        console.log(index)
    }


    // 전역 변수 설정 끝 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ





















    // 일반함수 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ


    // parameter : x
    // return : x
    // 기능 : 각 section의 높이를 innerHeight * innerHeightMultiple로 설정함.
    const setSectionHeight = function()
    {   
        for(let i = 0; i < sections.length; i++)
        {
            //js 설정
            sections[i].height =  window.innerHeight * sections[i].innerHeightMultiple;
            //css 설정
            sections[i].reference.style.height = `${sections[i].height}px`;
        }

      

    
    }




    // parameter : x
    // return : x
    // 기능: section0의 sticky 텍스트를 브라우저창 중앙에 정렬합니다.
    const setSection0TextLocation = function()
    {
          //section0 texts 위치 설정
          const texts = sections[0].texts;
          for(let i = 0; i < texts.length; i++)
          {
              texts[i].reference.style.top = `${window.innerHeight / 2}px`;
          }


    }





    // parameter : x
    // return : number ( currentSection )
    // 기능 :  scrollY가 위치하고 있는 섹션의 숫자를 리턴합니다. ex) section0 이면 0, section1이면 1을 리턴
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




    // parameter : top값이 궁금한 section값 
    // return : number ( 현재 section 영역의 top 부분이 위치한 Y값 )
    // 기능 : 파리미터로 넣은 섹션의 top의 Y값을 리턴합니다.
    const getCurrentSectionTopYValue = function(currentSectionValue)
    {
        let TopYValue = 0;
        for(let i = 0; i < currentSectionValue; i++)
        {   
            TopYValue = TopYValue + sections[i].height;
        }

        return TopYValue;
    }




    // parameter : x
    // return : x
    // 기능 : 전역변수 sectionScrollY를 갱신합니다. 
    //      ex) section1의 top의 scrollY값이 3000이라면  sectionScrollY = 0 입니다.
    //          반대로 section1의 sectionScrollY이 1000이라면 scrollY = 4000입니다.
    const setSectionScrollY = function()
    {   
    
        let TopYValue = getCurrentSectionTopYValue(currentSection);

        // 현재 섹션에서의 top을 0으로 하는 scrollY값으로 변환함.
        sectionScrollY = window.scrollY - TopYValue; 

    }

    // parameter : x
    // return : x
    // 기능 : 현재 section 위치에 따라 Body태그 id 속성을 변경
    const setBodyID = function()
    {
    document.body.setAttribute('id', `show_section${currentSection}`) 
    }






    // returnRange 와 scrollRange 로 나눠서 다시 만들자.
    const calcValueBySectionScrollY = function(range)
    {   
        sections[1].video.reference.style.opacity = '';

        let CalculatedValue = 0;
        currentSectionScrollRate = sectionScrollY / sections[currentSection].height;        
        

        // sectionScrollY 전체 범위를 기준으로 삼음.
        if(range.length === 2)
        {
            CalculatedValue = range[0] + ( range[1] - range[0] ) * currentSectionScrollRate;
            
            return CalculatedValue;
        }
        // sectionScrollY 중에서 특정 구간을 기준으로 삼음.
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

 




    
    const playAnimationByScroll = function()
    {
        let value = 0;
        currentSectionScrollRate = sectionScrollY / sections[0].height;
        
            // console.log('currentSection:', currentSection)
        switch(currentSection)
        {
            case 0:
                
                sections[0].text0.reference.style.opacity = '';
                sections[0].text1.reference.style.opacity = '';
                sections[0].text2.reference.style.opacity = '';
                sections[0].text3.reference.style.opacity = '';
                sections[0].text4.reference.style.opacity = '';
                
                // 캔버스에 이미지 그리기
                let imageIndex = Math.floor( calcValueBySectionScrollY([0, 499]) );
                sections[0].canvas.context2d.drawImage(sections[0].images.references[imageIndex],0,0);



                        // console.log('currentSectionScrollRate', currentSectionScrollRate)

                
                //image
                if( (0.7 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.9))
                {
                    value = calcValueBySectionScrollY(sections[0].canvas.opacityRange);
                    sections[0].canvas.reference.style.opacity = value;
                }
                else if( (0.9 < currentSectionScrollRate) && (currentSectionScrollRate <= 1) )
                {
                    sections[0].canvas.reference.style.opacity = 0;
                }

                

                // // section0-text를 for문으로 교체
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

            case 1 : 

                    // console.log('실행은 되니?')
                    // console.log('currentSectionScrollRate:',currentSectionScrollRate)
                //video
                if ( (0 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.2) )
                {
                    value = calcValueBySectionScrollY(sections[1].video.opacityRange);
                    sections[1].video.reference.style.opacity = value;
                }
                else
                {
                    sections[1].video.reference.style.opacity = 1;
                }
            
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

                console.log('sections[0].images.references[499]:',sections[0].images.references[498])

            let imageIndex = Math.floor( calcValueBySectionScrollY([0, 499]) );
            console.log('imageIndex:',imageIndex)
            sections[0].canvas.context2d.drawImage(sections[0].images.references[imageIndex], 0, 0)

        });

    }



    // parameter : x
    // return : x
    // 기능 : scrollWidth 크기에 따라서 section0, section1의 텍스트 크기를 조절함.
    const setFontSizeByScrollWidth = function()
    {


        // section0 - sticky 텍스트 폰트 조절
        if(document.body.scrollWidth <= 600)
        {
            for(let i = 0; i < sections[0].texts.length; i++)
            {
                sections[0].texts[i].reference.style.fontSize = '1.5rem';

            }

        }
        else
        {
            for(let i = 0; i < sections[0].texts.length; i++)
            {
                sections[0].texts[i].reference.style.fontSize = '3rem';

            }
        }

        // section1 - p 텍스트 폰트 조절
        const pElem = document.querySelector('.section1 > .section1-pDiv > .section1-pDiv-p')
        if(document.body.scrollWidth <= 600)
        {   
            
            pElem.style.fontSize = '1rem';
        }
        else if (document.body.scrollWidth <= 800)
        {
            pElem.style.fontSize = '1.5rem';
        }
        else
        {
            pElem.style.fontSize = '2rem';
        }


    }





    // return : x
    // parameter : x
    // 기능 : 윈도우 창 사이즈 크기에 따라 여백 안 생기게 section1 video 사이즈를 조절함. 비디오 16: 9비율은 지킴.
    const setVideoSizeBywindowSize = function()
    {
        let width = document.body.scrollWidth
        let height = window.innerHeight

        if( (width / 16) <= ( height / 9) )
        {
            sections[1].video.reference.style.width = '';
            sections[1].video.reference.style.height = '100%';
        }
        else
        {
            sections[1].video.reference.style.width = '100%';
            sections[1].video.reference.style.height = '';
        }
    }





    // return : x
    // parameter : x
    // 기능 : nav1(메뉴1)을 스크롤 내리면 제일 상단에 fixed 시킴.
    const makeNav1FixedByscrollY = function()
    {
        if (window.scrollY >= 48) 
        {
            nav1.reference.classList.add('nav1_makeNav1Fixed');

        }
        else
        {
            nav1.reference.classList.remove('nav1_makeNav1Fixed');

        }
    }



    // return : x
    // parameter : x
    // 기능 : footer - copyleft 를 스크롤 최하단에 붙임. 
    const setCopyleftLocation = function()
        {   
            footElem.style.top = '';

            let footHeight = footElem.clientHeight;
            let contentsHeight = document.body.scrollHeight;
            let topValue = contentsHeight - footHeight;

            footElem.style.bottom = '';
            footElem.style.top = `${topValue}px`;
            
            
            // 아래와 같이만 넣으니까. scrollHeight가 무한히 증식하는 현상이 일어났다. 
            // 이유는 top :scrollHeight 하니 계속 footer 높이만큼 scrollHeight가 증가했던 것. 
            // 그 증가한 값을 다시 넣으니 계속 scrollHeight가 증가했던 것이였다 높이가 끝없이 올라가더라 3만 픽셀 넘은 순간 깨달았다.
            // 그래서 푸터 높이만큼 빼서 top에 대입했다.
            // footElem.style.bottom = '';
            // footElem.style.top = `${document.body.scrollHeight}px`;


            // scrollHeight = 내용물 전체 높이
            // clientHeight = 패딩까지만 포함하는 높이
        }
        



    // 일반함수 끝 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ










   
    
   
    

    // 이벤트리스너 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

    //새로 고침할 때마다
    window.addEventListener('load', ()=>{

        
        
        
        
        setSectionHeight();
        setSection0TextLocation();

    
        

         //현재 섹션 위치 갱신함.
         currentSection = getCurrentSection();
        
         //섹션 위치에 따라 바디 ID를 바꿈.
         setBodyID();
 
         //sectionScrollY 갱신함.
         setSectionScrollY();

        setImages();
        

        setFontSizeByScrollWidth();

        setVideoSizeBywindowSize();

        setCopyleftLocation();


        
        console.log('window.innerHeight: ',window.innerHeight)
        console.log('document.body.scrollHeight:', document.body.scrollHeight)
       
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
        playAnimationByScroll();



        // nav1 엘리먼트를 스크롤 내리면 fixed로 바꾸기
        makeNav1FixedByscrollY();

       

       


                                // console.log('sectionScrollY', sectionScrollY)

                                // console.log('window.scrollY:', window.scrollY);

                                // console.log('currentSection', currentSection)


                                console.log('window.scrollY:',window.scrollY)

                                
                            

    });


    
    
    
    window.addEventListener('resize', ()=>{
        
        setSectionHeight();

        setSection0TextLocation();
        
        setFontSizeByScrollWidth();
        
        setVideoSizeBywindowSize();

        setCopyleftLocation();

        

    });

    

})();


// 사용 변수: scrollHeight, clientHeight, widthscroll, scrollY, innerHeight


// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// copyleft가 정확히 하단에 안 붙는 근본적 이유 : 
// section 높이를 고정값으로 정의해놓았기 때문에 p태그 내용물이 넘쳐도 section이 그에 맞춰 영역이 증가가 안 되기 때문이다.

// 해결방법 --> scrollheight 써서 top만큼 떨어트림. 다만 이 경우는 scrollY이 해당 섹션을 벗어나기 때문에 부차적인 문제를 해결해야함.






// 느낀 점  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 

// 1. 전역 변수, 함수는 네임을 길게 하더라도, 함수 내 지역 변수는 네임을 짧게 짧게 만들어라. 
//  --> 모든 변수가 가르키는 바를 정확하게 표현하려고 길게 적으니까. 멘탈 털리더라. 오히려 더 헷갈리다.
//  --> 한 눈에 전체구조를 파악하기 어려워서 그렇다.

// 2. HTML, CSS 구조를 제대로 잡고 못 잡고가 JS 작성 난이도가 천차만별이 된다.
//   HTML, CSS만 제대로 잡으면 JS는 비교적 쉽다는 느낌을 받았다. HTML, CSS 설계가 JS보다 더 중요한 것 같다.

// 3. currentSection을 bottomScrollY 기준으로 만들었어야 했는데 scrollY 기준으로 만들어가지고 이상하게 꼬였다.

// 4. if문이 이상하게 실행 안 되면 제일 먼저 else문부터 추가해라. 엄청 시간 날렸네. 알고보니 오타더라.
//    이런 거 빠르게 확인하려면, else문 써서 하나하나씩 추적하는 게 낫다.

// 5. element.style은 CSS inline값과 동일함. --> 따라서 id보다 우선순위가 높다.



// 실험  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// window load 이벤트에 setImages() 를 호출하니,  자바스크립트에서 sections[0].images.references[499] 객체가 안 가져와지더라.
// 생각해보니 당연하다. window load 이벤트 이후에 setImages가 호출되는 것이니까. 
// 상식적으로 생각하면 자바스크립트 내용보다 후에 실행되는 것이겠지.
// 그래서 자바스크립트 본문에서 setImages()를 호출했더니 정상적으로 객체가 불러와지더라.
// 원래는 setImages()를 최대한 빨리 호출해서 디코딩해놔야 속도가 빠르지 않겠냐해서 그런 것인데 생각해보니
// 어차피 브라우저 디스플레이에 뿌릴 때는 window load 이벤트 후에 뿌리는 것 같다. 따라서 JS에서 호출하나 window.load 이후에 호출하나
// 속도는 똑같은 것으로 사료된다.

// 결론: 그냥 window load에서 이미지 디코딩하자.

// setImages();

// sections[0].images.references[499].addEventListener('load', ()=>{

//     console.log('sections[0].images.references[499]:',sections[0].images.references[498])

//     let imageIndex = Math.floor( calcValueBySectionScrollY([0, 499]) );
//     console.log('imageIndex:',imageIndex)
//     sections[0].canvas.context2d.drawImage(sections[0].images.references[imageIndex], 0, 0)


// });
    


    // alert('뭐가 먼저 일어날 것인가?');
    // prompt('JS와 HTML 중에 뭐가 먼저?', '당연히 script를 아래에 썼으니 HTML이 먼저 다 구성되겠지');


