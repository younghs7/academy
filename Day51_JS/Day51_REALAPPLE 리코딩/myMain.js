
let currentSection = 0;
let sectionScrollY = 0;
let currentSectionScrollRate = 0; 

const sections = [

    // section 0 정보
    {
        reference : document.body.querySelector('.section0'),
        height : 0,
        innerHeightMultiple : 5,
        bottomScrollY : 0,
        topScrollY : 0,    

        stickyElements : document.body.querySelectorAll('.stickyElement'),
        textA : {
            reference : document.body.querySelector('.textA'),
            fadeInOpacity : [0, 1, {startRate:0.00, endRate:0.09}],
            fadeOutOpacity : [1, 0, {startRate:0.10, endRate:0.19}]
        },
        textB : {
            reference : document.body.querySelector('.textB'),
            fadeInOpacity : [0, 1, {startRate:0.20, endRate:0.29}],
            fadeOutOpacity : [1, 0, {startRate:0.30, endRate:0.39}]
        },
        textC : {
            reference : document.body.querySelector('.textC'),
            fadeInOpacity : [0, 1, {startRate:0.40, endRate:0.49}],
            fadeOutOpacity : [1, 0, {startRate:0.50, endRate:0.59}]
        },
        textD : {
            reference : document.body.querySelector('.textD'),
            fadeInOpacity : [0, 1, {startRate:0.60, endRate:0.69}],
            fadeOutOpacity : [1, 0, {startRate:0.70, endRate:0.79}]
        },
        textE : {
            reference : document.body.querySelector('.textE'),
            fadeInOpacity : [0, 1, {startRate:0.80, endRate:0.89}],
            fadeOutOpacity : [1, 0, {startRate:0.90, endRate:0.99}]
        }


    },
    // section1 정보
    {
        reference : document.body.querySelector('.section1'),
        height : 0,
        innerHeightMultiple : 5,
        bottomScrollY : 0,
        topScrollY : 0,   
    },

];


console.log(sections[0].textA)



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

        console.log('rate:', rate);

        CalculatedValue =  range[0] + ( range[1] - range[0] ) * rate;
            console.log('CalculatedValue:', CalculatedValue)
        

        return CalculatedValue;
    }

    
    
}



const playAnimation = function()
{
    let opacity = 0;
    switch(currentSection)
    {
        case 0:

            sections[0].textA.reference.style.opacity = 0;
            sections[0].textB.reference.style.opacity = 0;
            sections[0].textC.reference.style.opacity = 0;
            sections[0].textD.reference.style.opacity = 0;
            sections[0].textE.reference.style.opacity = 0;

            currentSectionScrollRate = sectionScrollY / sections[0].height;
                    // console.log('currentSectionScrollRate', currentSectionScrollRate)


                    
            if(currentSectionScrollRate <= 0.1)
            {
                opacity = calcValueBySectionScrollY(sections[0].textA.fadeInOpacity);
                sections[0].textA.reference.style.opacity = opacity;
            }
            else if( (0.1 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.2))    
            {
                opacity = calcValueBySectionScrollY(sections[0].textA.fadeOutOpacity);
                sections[0].textA.reference.style.opacity = opacity;
                
            }
            else if( (0.2 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.3))    
            {
                opacity = calcValueBySectionScrollY(sections[0].textB.fadeInOpacity);
                sections[0].textB.reference.style.opacity = opacity;
                
            }
            else if( (0.3 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.4))    
            {
                opacity = calcValueBySectionScrollY(sections[0].textB.fadeOutOpacity);
                sections[0].textB.reference.style.opacity = opacity;
                
            }
            else if( (0.4 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.5))    
            {
                opacity = calcValueBySectionScrollY(sections[0].textC.fadeInOpacity);
                sections[0].textC.reference.style.opacity = opacity;

            }
            else if( (0.5 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.6))    
            {
                opacity = calcValueBySectionScrollY(sections[0].textC.fadeOutOpacity);
                sections[0].textC.reference.style.opacity = opacity;
                
            }
            else if( (0.6 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.7))    
            {
                opacity = calcValueBySectionScrollY(sections[0].textD.fadeInOpacity);
                sections[0].textD.reference.style.opacity = opacity;
                
            }
            else if( (0.7 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.8))    
            {
                opacity = calcValueBySectionScrollY(sections[0].textD.fadeOutOpacity);
                sections[0].textD.reference.style.opacity = opacity;
                
            }
            else if( (0.8 < currentSectionScrollRate) && (currentSectionScrollRate <= 0.9))    
            {
                opacity = calcValueBySectionScrollY(sections[0].textE.fadeInOpacity);
                sections[0].textE.reference.style.opacity = opacity;
                
            }
            else if( (0.9 < currentSectionScrollRate) && (currentSectionScrollRate <= 1))    
            {
                opacity = calcValueBySectionScrollY(sections[0].textE.fadeOutOpacity);
                sections[0].textE.reference.style.opacity = opacity;
                
            }
            
                console.log('opacity:', opacity)

            break;
        
        default :
            break;

    }

        //  console.log('sections[0].textA.reference.style.opacity:', sections[0].textA.reference.style.opacity)
}





// 이벤트리스너 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

window.addEventListener('load', ()=>{

    
    setSectionHeight();
    setSectionBottomTopScrollY();
   
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
    playAnimation();
    


                            // console.log('sectionScrollY', sectionScrollY)

                            // console.log('window.scrollY:', window.scrollY);

                            // console.log('currentSection', currentSection)

});




