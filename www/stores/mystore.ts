import { defineStore } from 'pinia'

export const useLoginStore = defineStore('login', {
    state: () => {
        return {
            username: '',
            token: '',
        }
    },
    persist: true,
})