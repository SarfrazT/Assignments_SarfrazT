// LandingPage.js
import React from 'react';
import { Container, Row, Col } from 'react-bootstrap';
import './LandingPage.js'; // Import the CSS
import logo from './logo1.png'; // Import your logo1
import { Button } from 'react-bootstrap';
import { Link } from 'react-router-dom';


function LandingPage() {
    return (
        
        <div>
        <h1 style={{ color: 'white' }}>Welcome to our Music App</h1>
        <p style={{ color: 'white' }}>Log in or register to start using our app</p>
       
        <Link to="/login">
            <Button variant="primary" className="mr-2">Login</Button>
        </Link>
        <Link to="/register">
            <Button variant="secondary">Register</Button>
        </Link>
        </div>
    );
}

export default LandingPage;