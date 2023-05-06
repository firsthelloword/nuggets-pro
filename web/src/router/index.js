import { createRouter, createWebHistory } from "vue-router";
import Home from '../views/Home.vue'
import Index from '../views/Index.vue'
import HeatPoint from '../views/HeatPoint.vue'
import Lesson from '../views/Lesson.vue'
const routes = [
  { path: '/', component: Home,
  children: [
    {
      //首页菜单
      path: '/index',
      component: Index,
    },
    {
      //沸点
      path: '/heatPoint',
      component: HeatPoint
    },
    {
      //课程
      path: '/lesson',
      component: Lesson
    }
  ],

},
 
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
