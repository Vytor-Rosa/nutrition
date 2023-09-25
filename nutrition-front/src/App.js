import logo from './logo.svg';
import './App.css';
import laranja from './mango.png';

function App() {
  return (
    <div className="Main">
      <header className="header">
        <div className='atributos'>
          <div className='atributo'>Home</div>
          <div className='atributo'>Manifesto</div>
          <div className='atributo'>Docs</div>
        </div>
      </header>

      <div className='content'>
        <div className='slogan'>
          <div className='text'>
            <div className='text1'>O melhor da nutrição</div>
            <div className='text2'>Pro Health</div>
          </div>
          <button className='participar'>Participar do desenvolvimento</button>
        </div>
        <div className='imagem'>
          <img className='img' src={laranja} />
        </div>
      </div>
    </div>
  );
}

export default App;
