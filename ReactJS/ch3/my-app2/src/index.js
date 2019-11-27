import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';

// ReactDOM.render(<App />, document.getElementById('root'));

function tick() {
    const element = ( // (1) element 만들고 
        <div>
            <h1>Hello, world!</h1>
            <h2>It is {new Date().toLocaleTimeString()}.</h2>
        </div>
    );

    ReactDOM.render( // (2) element rendering
        element,
        document.getElementById('root'));
}

setInterval(tick, 1000); // 매 초마다 tick 함수를 호출 

// const element = <h1>hello, world!</h1>
// ReactDOM.render(
//     element,
//     document.getElementById('root')
// );

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
