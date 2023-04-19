import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import ElementPlus from 'element-plus'
import * as icons from '@element-plus/icons-vue'

import 'element-plus/dist/index.css'
import "font-awesome/css/font-awesome.min.css"
const app = createApp(App)
for (const iconName in icons){
    if (Reflect.has(icons, iconName)) {
        const item = icons[iconName]
        app.component(iconName, item)
      }
}

app.use(ElementPlus)
app.use(router)
app.mount("#app")
