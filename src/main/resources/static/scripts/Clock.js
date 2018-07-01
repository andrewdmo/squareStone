import React from 'react'; //needed?

class Clock extends React.Component {

    constructor(props) {
        super(props);
        this.state = {date: new Date()};
    }

    componentDidMount() {
        this.timerID = setInterval(
            () => this.tick(),
            1000
        );
    }

    componentWillUnmount() {
        clearInterval(this.timerID);
    }


    tick() {
        this.setState({
            date: new Date()
        });
    }


    render() {
        return (
            <div>
                <p class="menuText dataField">{this.state.date.toLocaleString()}</p>
            </div>
        );

    }
}


ReactDOM.render(
    <Clock/>,
    document
        .getElementById(
            'clock'
        ))
;