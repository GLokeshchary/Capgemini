const menuBtn=document.querySelector('.menu-btn');
const hamburger=document.querySelector('.menu-btn__burger');
const nav=document.querySelector('.nav');
const menunav=document.querySelector('.menu-nav');
const navitems=document.querySelectorAll('.menu-nav__item');
let showmenu=false;
menuBtn.addEventListener('click',toggleMenu);
function toggleMenu(){
    if(!showmenu){
        hamburger.classList.add('open');
        nav.classList.add('open');
        menunav.classList.add('open');
        navitems.forEach(item=> item.classList.add('open'));
        showmenu=true;
    }else{
        hamburger.classList.remove('open');
        nav.classList.remove('open');
        menunav.classList.remove('open');
        navitems.forEach(item=> item.classList.remove('open'));
        showmenu=false;
    }
}