import axios  from "axios";

const get =(url,data) => {
    axios({
        method: 'get',
        url: url,
        params: data
    })
}
const post = function(url,data){
    axios({
        method: 'post',
        url: url,
        data: data
    })
}

export default{
    get,post
}
