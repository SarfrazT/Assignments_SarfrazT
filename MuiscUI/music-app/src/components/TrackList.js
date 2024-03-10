import { useState, useEffect } from 'react';
import axios from 'axios';

function TrackList() {
    const [tracks, setTracks] = useState([]);

    useEffect(() => {
        const token = 'BQCzo3cbg3mv-DKyvvUr1wQ0slvmORAudykEu592U9sFbckiF7RLp4PibP234gkGjSZlBJTuCgGjiHbXc6EDj_ij9Rf_eqP1sCdq_YtTCIOTLzbCX9X_HMkgEWpRXwOjDRnh6ihE2qCiVt72_nnqL5PE6MQS_KLILDYDwK5YXbG7ZXvEF4Hb9RNGw5Sd7BjWgEWbUg'; // Replace with your actual token

        axios.get('https://api.spotify.com/v1/me/tracks', {
            headers: {
                'Authorization': `Bearer ${token}`
            }
        })
        .then(response => {
            setTracks(response.data.items); // Update this line
        })
        .catch(error => {
            console.error('Error fetching tracks', error);
        });
    }, []);

    return (
        <div>
            {tracks.map(track => (
                <div key={track.track.id}> {/* Update this line */}
                    <h2>{track.track.name}</h2> {/* Update this line */}
                </div>
            ))}
        </div>
    );
}

export default TrackList;