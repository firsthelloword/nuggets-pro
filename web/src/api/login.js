import request from '@/utils/http'

export function login(params){ 
    return request({
        url:'/user/hello',
        method:'get',
        // params:params
      })
}