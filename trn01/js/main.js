// window.addEventListener('DOMContentLoaded', function () {
//     document.querySelector('.header').style.display = 'none';
// })
/*제이쿼리가 제일 위 */

$(function(){
   $('.main_slider').slick({
       arrows:false,/*버튼임 */
       autoplay: true,
       autoplaySpeed: 1000,
       vertical: true, /*위에서 아래로 슬라이드 */
       dots:true,

   });

   $('.mopen').on('click',function(){
       $('.gnb').toggleClass('on')
   })
})/* */
/* 슬릭에서 만든 소스를 불러오는 것 ,옵션은 중괄호*/
