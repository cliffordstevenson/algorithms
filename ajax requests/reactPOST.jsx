import React, { useState } from 'react';
import axios from 'axios';

const POST = () => {

    const [formData, setFormData] = useState({
        name: '',
        email: '',
        message: ''
    });

    const handleSubmit = (event) => {
        event.prevenDefault();
        axios.post('/submit-form', formData)
            .then(response => console.log(response))
            .catch(error => console.log(error))
    };

    const handleChange = (event) => {
        const { name, value } = event.target;
        setFormData(prevState => ({ ...prevState, [name]: value }))
    };

    return (
        <div>
            <div>
                <form onSubmit={handleSubmit}>
                    <label>
                        Name:
                        <input type="text" name="name" value={formData.name} onChange={handleChange} />
                    </label>
                    <label>
                        Email:
                        <input type="email" name="email" value={formData.email} onChange={handleChange} />
                    </label>
                    <label>
                        Message:
                        <textarea name="message" value={formData.message} onChange={handleChange} />
                    </label>
                    <button type="submit">Submit</button>
                </form>
            </div>
        </div>
    )
}

export default POST
