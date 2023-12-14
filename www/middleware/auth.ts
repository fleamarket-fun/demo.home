import {useLoginStore} from "~/stores/mystore";
export default defineNuxtRouteMiddleware((to, from) => {

    console.log(useLoginStore().username)
    if(useLoginStore().username==''){
        return navigateTo('/')
    }

})