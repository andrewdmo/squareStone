// TODO convert to React:

const form = document.querySelector('form');

const spaceFormSubmit = document.querySelector('#spaceFormSubmit');

// TODO concatenate on demand:
const tenantSpace1 = document.querySelector('#tenantSpace1');
const tenantSpace2 = document.querySelector('#tenantSpace2');
const tenantSpace3 = document.querySelector('#tenantSpace3');
const tenantSpace4 = document.querySelector('#tenantSpace4');

const tenantSqFt = tenantSpace1 + tenantSpace2 + tenantSpace3 + tenantSpace4;


const commonSpace1 = document.querySelector('#commonSpace1');
const commonSpace2 = document.querySelector('#commonSpace2');

const commonSqFt = commonSpace1 + commonSpace2;

const totalSqFt = tenantSpace1 + tenantSpace2 + tenantSpace3 + tenantSpace4 + commonSpace1 + commonSpace2;

const tenantPercentOfTotal1 = tenantSpace1 / tenantSqFt;
const tenantPercentOfTotal2 = tenantSpace2 / tenantSqFt;
const tenantPercentOfTotal3 = tenantSpace3 / tenantSqFt;
const tenantPercentOfTotal4 = tenantSpace4 / tenantSqFt;

const commonPercentofTotal1 = commonSpace1 / commonSqFt;
const commonPercentofTotal2 = commonSpace2 / commonSqFt;

const percentSum = tenantPercentOfTotal1 + tenantPercentOfTotal2 + tenantPercentOfTotal3 + tenantPercentOfTotal4 + commonPercentofTotal1 + commonPercentofTotal2;
const tenantOnlyPercent = tenantPercentOfTotal1 + tenantPercentOfTotal2 + tenantPercentOfTotal3 + tenantPercentOfTotal4;


// OVERRIDE form submitting
form.addEventListener('submit', function (e) {
        e.preventDefault();
    }
)
;

// RUN function when SUBMIT clicked
spaceFormSubmit.addEventListener('click', function () {
        // STORE the entered name in web storage
        localStorage.setItem('tenantSpace1', tenantSpace1.value);
        localStorage.setItem('tenantSpace2', tenantSpace2.value);
        localStorage.setItem('tenantSpace3', tenantSpace3.value);
        localStorage.setItem('tenantSpace4', tenantSpace4.value);

        localStorage.setItem('tenantSqFt', tenantSqFt.value);

        localStorage.setItem('commonSpace1', commonSpace1.value);
        localStorage.setItem('commonSpace2', commonSpace2.value);

        localStorage.setItem('commonSqFt', commonSqFt.value);

        // run nameDisplayCheck() to sort out displaying the
        // personalized greetings and updating the form display
        // spaceFormDisplayCheck();
    }
)
;


// THIS PERSISTS DATA THRU REFRESH (I THINK):

// define the nameDisplayCheck() function
// function spaceFormDisplayCheck() {
//     // check whether the 'name' data item is stored in web Storage
//     if (localStorage.getItem('form')) {
//         // If it is, display personalized greeting
//         let form = localStorage.getItem('form');
//         // h1.textContent = 'Welcome, ' + name;
//         // personalGreeting.textContent = 'Welcome to our website, ' + name + '! We hope you have fun while you are here.';
//         // hide the 'remember' part of the form and show the 'forget' part
//         // forgetDiv.style.display = 'block';
//         // rememberDiv.style.display = 'none';
//     } else {
//         // if not, display generic greeting
//         h1.textContent = 'Welcome to our website ';
//         personalGreeting.textContent = 'Welcome to our website. We hope you have fun while you are here.';
//         // hide the 'forget' part of the form and show the 'remember' part
//         forgetDiv.style.display = 'none';
//         rememberDiv.style.display = 'block';
//     }
// }
//
// document.body.onload = spaceFormDisplayCheck;
