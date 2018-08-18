export class Container extends React.Component {
    render() {
        if (!this.props.loaded) {
            return <div>Loading...</div>
        }
        return (
            <div>
                <Map google={this.props.google}/>
            </div>)
    }
}

//does most of the work, loads Goog API:
export default GoogleApiComponent({
    apiKey: AIzaSyAEgsGQb9pHiOX0p8-VpZj46VMwOxg0csU
})(Container)