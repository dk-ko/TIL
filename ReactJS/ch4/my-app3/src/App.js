import React from 'react';
import logo from './logo.svg';
import './App.css';
import Comment from './Comment'; // 내보낸 Component를 import 후 사용, Component는 대문자여야함, 소문자는 html로 인식

const comments = [
  { name: 'Jade Ko', content: 'My comment!'},
  { name: 'Jessie Jung', content: 'React Master'},
];

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
        {comments.map((comment, index) => {
          return (
            <Comment
              name = {comment.name}
              content = {comment.content} />
          )
        })}
      </div>
    </div>
  ); // comment를 호출하는 곳에서 props를 넣어준다. 
}

export default App;
