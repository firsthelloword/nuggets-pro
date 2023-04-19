import request from '@/utils/http'

export function login(params){ 
    return request({
        url:'/hello',
        method:'get',
        params:params
      })
}