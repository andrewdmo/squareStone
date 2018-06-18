class topJS extends React.Component {
    render() {
        return <div className="row top">
            <div className="row profile">

                <div className="four columns" style="width: fit-content">
                    <p className="profileText">Back Home</p>

                    <a href="/templates/index.html" rel="#home">
                        <img src="/static/img/squareStone.jpg"
                             className="profile pic shade"/>
                    </a>
                </div>

                <div className="eight columns profile name">
                    <a href="/static/img/squareStone.jpg">
                        <h1 className="text shadow link">squareStone</h1></a>

                    <a href="/static/img/squareStone.jpg">
                        <h2 className="text shadow link u-pull-left">Commercial Property Analysis
                        </h2></a>

                </div>
                <!--NAME-->

                <div className="menuBarFieldBack clock">
                    <p className="menuText dataField">
                    </p>
                </div>
                <!--CLOCK-->
                <br/>
            </div>

            <div className="ten columns menuBar">

                <a href="/static/img/squareStone.jpg"
                   rel="#home">
                    <p className="menuText shadow none"> Home </p>
                </a>


                <a href="mapping.html">
                    <p className="menuText shadow none">Mapping
                    </p>
                </a>
                <a href="about.html">
                    <p className="menuText shadow none">About
                    </p>
                </a>


            </div>
            <!--row two menuBar-->

            <div className="menuBarFieldBack values">
                <fieldset style="margin-bottom: 0">

                    <table style="margin-bottom: 0">
                        <!--<thead></thead>-->
                        <tbody>
                        <tr className="none">
                            <td style="padding: 0">
                                <!--<legend>Total:</legend>-->
                                <label htmlFor="totalSqFt">totalSqFt: </label>
                                <input type="number" className="menuText dataField values" id="totalSqFt"
                                       name="totalSqFt"
                                       value="0"/>
                            </td>
                        </tr>
                        <tr className="none">
                            <td style="padding: 0">
                                <label htmlFor="purchaseTotal">purchaseTotal: </label>
                                <p className="menuText dataField values" id="purchaseTotal">
                                </p>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </fieldset>

            </div>
            <!--menuBarFieldBack values-->
        </div>;
    }
}