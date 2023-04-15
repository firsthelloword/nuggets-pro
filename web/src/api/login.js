import axios  from "axios"

export function login(input){ 
    return axios.post('Login/GetToken')
}
export function SendCode(eamil){
    return axios.post('Login/SendEmailCode',{eamil:eamil})
}