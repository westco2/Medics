let closer = document.querySelector('#closer');

closer.onclick = () => {
  closer.style.display = 'none';
  navbar_yy.classList.remove('active');
  aed_cart.classList.remove('active');
  login_form.classList.remove('active');
  
};

let closer_left = document.querySelector('#closer_left');

closer_left.onclick = () => {
  closer_left.style.display = 'none';
  navbar_yy.classList.remove('active');
  aed_cart.classList.remove('active');
  login_form.classList.remove('active');
  
};

let navbar_yy =  document.querySelector('.navbar_yy');


document.querySelector('#menu_btn').onclick = () => {
  closer_left.style.display = 'block'; 
  navbar_yy.classList.toggle('active'); 
};

let aed_cart =  document.querySelector('.aed_cart');

document.querySelector('#aed_btn').onclick = () => {
  closer.style.display = 'block'; 
  aed_cart.classList.toggle('active');
};

// let login_form =  document.querySelector('.login_form');

// document.querySelector('#login_btn').onclick = () => {
//   closer.style.display = 'block'; 
//   login_form.classList.toggle('active');
// };


        function toggleNavbar() {
            var navbar = document.getElementById('navbar');
            navbar.classList.toggle('active');
        };
    
