import React from 'react';

function Wishlist() {
    const wishlist = ['Track 1', 'Track 2', 'Track 3']; // Replace with actual data

    return (
        <ul>
            {wishlist.map((track, index) => (
                <li key={index}>{track}</li>
            ))}
        </ul>
    );
}

export default Wishlist;