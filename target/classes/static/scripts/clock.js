function clock() {
    const element = (
        <div>
            <p class="menuText dataField">{new Date().toLocaleString()}</p>
        </div>
    );
    ReactDOM.render(element, document.getElementById('clock'));
}

setInterval(clock, 1000);