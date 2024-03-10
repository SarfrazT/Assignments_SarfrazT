import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import LandingPage from './components/LandingPage';
import Login from './components/Login';
import Register from './components/Register';
import TrackList from './components/TrackList';
import Wishlist from './components/Wishlist';
import logo from './logo1.png'; // Adjust the path according to your project structure

function App() {
  return (
    <div style={{
    backgroundImage: `url(${logo})`,
    backgroundSize: 'cover',
    backgroundRepeat: 'no-repeat',
    height: '100vh',
    width: '100vw'
     }}>
    <Router>
      <Routes>
        <Route path="/" element={<LandingPage />} exact />
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />
        <Route path="/tracks" element={<TrackList />} />
        <Route path="/wishlist" element={<Wishlist />} />
      </Routes>
    </Router>
    </div>
  );
}

export default App;