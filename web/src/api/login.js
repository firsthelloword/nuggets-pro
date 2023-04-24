import request from '@/utils/http'

export function login(data){ 
    return request({
        url:'/user/login',
        method:'post',
        data:data
      })
}