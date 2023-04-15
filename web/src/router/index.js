import { createRouter, createWebHistory } from "vue-router";
import Home from '../views/home.vue'
import Index from '../views/index.vue'
import HeatPoint from '../views/heatPoint.vue'
import Lesson from '../views/lesson.vue'
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
