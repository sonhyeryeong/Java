

$(function(){


    $('.main_slider').slick({
        arrows:false,
        autoplay:true,
        autoplaySpeed:1000,
        vertical:true,
        dots:true,


     });

     $('.molla').on('click',function(){
         $('.gnb').toggleClass('on')
     })
 
    
 })
 /* 슬릭에서 만든 소스를 불러오는 것 ,옵션은 중괄호*/