import axios from 'axios';

const instance = axios.create(
    {
        baseURL: 'http://localhost:5002/api',
        timeout: 15000,
        headers: {
            'Content-Type': 'application/json'
        }
    }
)

export const parse = async(value) => {
    const { data } = await instance.post("/parse2", {peticion: value})
    return data
}