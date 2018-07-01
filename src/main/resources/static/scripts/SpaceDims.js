import React from 'react'; //needed?
import './css/sqStStyle.css'

//maybe:
const sqStStyle = () => (
    <div className="sqStStyle">
    </div>
);


class SpaceDims extends React.Component {

    constructor(props) {
        super(props);

        // binds, use when calling method w/o ()
        this.spaceFormSubmit = this.spaceFormSubmit.bind(this);

        const tenantSqFt = tenantSpace1 + tenantSpace2 + tenantSpace3 + tenantSpace4;

        const commonSqFt = commonSpace1 + commonSpace2;

        const totalSqFt = tenantSqFt + commonSqFt;

        this.state = {


            //     const form = document.querySelector('form');
            //
            // const spaceFormSubmit = document.querySelector('#spaceFormSubmit');

// TODO concatenate on demand:
            tenantSpace1: document.querySelector('#tenantSpace1'),
            tenantSpace2: document.querySelector('#tenantSpace2'),
            tenantSpace3: document.querySelector('#tenantSpace3'),
            tenantSpace4: document.querySelector('#tenantSpace4'),

            tenantSqFt: tenantSqFt, //this?

            commonSpace1: document.querySelector('#commonSpace1'),
            commonSpace2: document.querySelector('#commonSpace2'),

            commonSqFt: this.commonSqFt, //this?

            totalSqFt: totalSqFt //this?
        };

        console.log('tenantSqFt: ' + tenantSqFt);
        console.log('commonSqFt: ' + commonSqFt);
        console.log('totalSqFt: ' + totalSqFt);

        // const tenantPercentOfTotal1 = tenantSpace1 / tenantSqFt;
        // const tenantPercentOfTotal2 = tenantSpace2 / tenantSqFt;
        // const tenantPercentOfTotal3 = tenantSpace3 / tenantSqFt;
        // const tenantPercentOfTotal4 = tenantSpace4 / tenantSqFt;
        //
        // const commonPercentofTotal1 = commonSpace1 / commonSqFt;
        // const commonPercentofTotal2 = commonSpace2 / commonSqFt;
        //
        // const percentSum = tenantPercentOfTotal1 + tenantPercentOfTotal2 + tenantPercentOfTotal3 + tenantPercentOfTotal4 + commonPercentofTotal1 + commonPercentofTotal2;
        // const tenantOnlyPercent = tenantPercentOfTotal1 + tenantPercentOfTotal2 + tenantPercentOfTotal3 + tenantPercentOfTotal4;
    }


    spaceFormSubmit() {
// STORE the entered name in web storage
        localStorage.setItem('tenantSpace1', tenantSpace1.value);
        console.log(tenantSpace1.value);

        localStorage.setItem('tenantSpace2', tenantSpace2.value);
        localStorage.setItem('tenantSpace3', tenantSpace3.value);
        localStorage.setItem('tenantSpace4', tenantSpace4.value);


        localStorage.setItem('tenantSqFt', tenantSqFt.value);
        console.log('tenantSqFt: ' + tenantSqFt.value);

        localStorage.setItem('commonSpace1', commonSpace1.value);
        localStorage.setItem('commonSpace2', commonSpace2.value);

        localStorage.setItem('commonSqFt', commonSqFt.value);
    }

    render() {
        return (

        )
    }
}


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
