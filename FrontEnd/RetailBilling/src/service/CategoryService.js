import axios from "axios"


export const addCategory = async (category) =>{
    axios.post('http://localhost:8080/api/v1.0/categories',category);
}