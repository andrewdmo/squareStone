// import React from 'react'; //needed?
// import './css/sqStStyle.css'

//maybe:
// const sqStStyle = () => (
//     <div className="sqStStyle">
//     </div>
// );


class SpaceDim extends React.Component {

    constructor(props) {
        super(props);

        // binds, use when calling method w/o ()
        this.spaceFormSubmit = this.spaceFormSubmit.bind(this);

        function tenantSqFt(tenantSpace1, tenantSpace2, tenantSpace3, tenantSpace4) {
            return tenantSpace1 + tenantSpace2 + tenantSpace3 + tenantSpace4;
        }

        function commonSqFt(commonSpace1, commonSpace2) {
            return commonSpace1 + commonSpace2;
        }

        function totalSqFt(tenantSqFt, commonSqFt) {
            return tenantSqFt + commonSqFt;
        }

        this.state = {


            //     const form = document.querySelector('form');
            //
            // const spaceFormSubmit = document.querySelector('#spaceFormSubmit');

// TODO concatenate on demand:
            tenantSpace1: document.querySelector('#tenantSpace1'),
            tenantSpace2: document.querySelector('#tenantSpace2'),
            tenantSpace3: document.querySelector('#tenantSpace3'),
            tenantSpace4: document.querySelector('#tenantSpace4'),

            commonSpace1: document.querySelector('#commonSpace1'),
            commonSpace2: document.querySelector('#commonSpace2'),


            tenantSqFt: tenantSqFt(),
            commonSqFt: commonSqFt(),
            totalSqFt: totalSqFt()
        };


        console.log('totalSqFt: ' + totalSqFt())

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

// https://hjnilsson.com/2016/12/11/generic-form-handleChange-in-react/
    handleChange(e) {
        // If you are using babel, you can use ES 6 dictionary syntax
        let change = {[e.target.name]: e.target.value};
        // let change = {}
        // change[e.target.name] = e.target.value
        this.setState(change);
    }

    render() {
        return (
            <form id="spaceDimForm">


                <table className="twelve columns" title="Space Dimensions">
                    <thead>

                    <tr>
                        <th colSpan="2">
                            <h1 className="tableHeader">Space Dimensions</h1>
                        </th>
                    </tr>

                    </thead>


                    <tbody>
                    <tr>
                        <td>
                            <fieldset name="totalSqFtTitle">
                                <legend className="tableHeader h2">Total Sq Footage</legend>
                            </fieldset>
                        </td>

                        <td></td>
                    </tr>

                    <tr>
                        <td>
                            <fieldset name="tenantSqFt">
                                <legend className="tableHeader h3">Tenant Space</legend>

                                <label className="tableLabel" htmlFor="tenantSpace1">Unit 1</label>
                                <input className="tableField" type="text" id="tenantSpace1" defaultValue={0}
                                       autoFocus="autofocus">{this.state.tenantSpace1}</input>

                                <label className="tableLabel" htmlFor="tenantSpace2">Unit 2</label>
                                <input className="tableField" type="text"
                                       id="tenantSpace2">{this.state.tenantSpace2}</input>

                                <label className="tableLabel" htmlFor="tenantSpace3">Unit 3</label>
                                <input className="tableField" type="text"
                                       id="tenantSpace3">{this.state.tenantSpace3}</input>

                                <label className="tableLabel" htmlFor="tenantSpace4">Unit 4</label>
                                <input className="tableField" type="text"
                                       id="tenantSpace4">{this.state.tenantSpace4}</input>


                                <label className="tableLabel" htmlFor="tenantSqFt">Total Tenant Sq Ft</label>
                                <code className="tableField" id="tenantSqFt">{this.state.tenantSqFt}</code>

                            </fieldset>
                        </td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>

                            <fieldset name="commonSqFt">
                                <legend className="tableHeader h3">Common Space</legend>
                                <label className="tableLabel" htmlFor="commonSpace1">Common 1</label>
                                <input className="tableField" type="text"
                                       id="commonSpace1">{this.state.commonSpace1}</input>

                                <label className="tableLabel" htmlFor="commonSpace2">Common 2</label>
                                <input className="tableField" type="text"
                                       id="commonSpace2">{this.state.commonSpace2}</input>

                                <label className="tableLabel" htmlFor="commonSqFt">Total Common Sq Ft</label>
                                <input className="tableField" type="text"
                                       id="commonSqFt">{this.state.commonSqFt}</input>
                            </fieldset>
                        </td>
                        <td></td>
                    </tr>


                    <tr>
                        <td colSpan="2"><input className="button" id="spaceFormSubmit" type="submit"
                                               value="Submit"/></td>
                    </tr>

                    </tbody>
                </table>
            </form>
        )
    }
}

ReactDOM
    .render(
        <SpaceDim/>,
        document
            .getElementById(
                'spaceDimForm'
            ))
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
