import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import ElementPlus from 'element-plus'
import * as icons from '@element-plus/icons-vue'
import axios  from "axios";
import VueAxios from 'vue-axios'

import 'element-plus/dist/index.css'
import 'windi.css'
import "font-awesome/css/font-awesome.min.css"
const app = createApp(App)
for (const iconName in icons){
    if (Reflect.has(icons, iconName)) {
        const item = icons[iconName]
        app.component(iconName, item)
      }
}
axios.defaults.baseURL = "http://localhost:8888"

app.use(VueAxios,axios)
app.use(ElementPlus)
app.use(router)
app.mount("#app")
