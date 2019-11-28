import React from 'react';
import logo from './logo.svg';
import './App.css';
import Comment from './Comment'; // 내보낸 Component를 import 후 사용, Component는 대문자여야함, 소문자는 html로 인식

function App() {
  return (
    <div className="App" style={{ padding: 16, backgroundColor: '#282c34'}}>
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
      <div>
        <Comment/>
      </div>
    </div>
  );
}

export default App;
