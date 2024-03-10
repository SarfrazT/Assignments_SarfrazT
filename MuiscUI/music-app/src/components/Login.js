import React from 'react';
import { useState, useEffect } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

function Login() {
    const [isLoggedIn, setIsLoggedIn] = useState(false);
    const navigate = useNavigate();
    const token = 'BQCzo3cbg3mv-DKyvvUr1wQ0slvmORAudykEu592U9sFbckiF7RLp4PibP234gkGjSZlBJTuCgGjiHbXc6EDj_ij9Rf_eqP1sCdq_YtTCIOTLzbCX9X_HMkgEWpRXwOjDRnh6ihE2qCiVt72_nnqL5PE6MQS_KLILDYDwK5YXbG7ZXvEF4Hb9RNGw5Sd7BjWgEWbUg'; // Replace with your actual token

    const handleLogin = () => {
        window.location.href = 'http://localhost:9191/spotify/authorize';

        axios.get('https://api.spotify.com/v1/me/tracks', {
            headers: {
                'Authorization': `Bearer ${token}`
            }
        })
        .then(response => {
            console.log(response.data);
            setIsLoggedIn(true); // Update isLoggedIn when the login is successful
        })
        .catch(error => {
            console.error('Error fetching tracks', error);
        });
    };

    useEffect(() => {
        if (isLoggedIn) {
            setTimeout(() => {
                navigate('/tracks');
            }, 10000); // Redirect after 10 seconds
        }
    }, [isLoggedIn, navigate]);

    return (
        <div>
            <button onClick={handleLogin}>Login</button>
        </div>
    );
}

export default Login;