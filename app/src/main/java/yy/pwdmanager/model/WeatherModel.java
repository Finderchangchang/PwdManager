package yy.pwdmanager.model;

import java.util.List;

/**
 * Created by Administrator on 2016/12/27.
 */

public class WeatherModel {

    /**
     * time : 1482833221
     * area : [["河北","09"],["保定","0902"],["保定","101090201"]]
     * weather : [{"date":"2016-12-27","info":{"day":["0","晴","3","北风","微风"],"night":["1","多云","-7","南风","微风"]}},{"date":"2016-12-28","info":{"dawn":["1","多云","-7","南风","微风"],"day":["1","多云","2","南风","微风"],"night":["0","晴","-10","西北风","微风"]}},{"date":"2016-12-29","info":{"dawn":["0","晴","-10","西北风","微风"],"day":["0","晴","2","南风","微风"],"night":["0","晴","-8","南风","微风"]}},{"date":"2016-12-30","info":{"dawn":["0","晴","-8","南风","微风"],"day":["1","多云","3","南风","微风"],"night":["1","多云","-7","南风","微风"]}},{"date":"2016-12-31","info":{"dawn":["1","多云","-7","南风","微风"],"day":["1","多云","4","北风","微风"],"night":["1","多云","-6","北风","微风"]}}]
     * life : {"date":"2016-12-27","info":{"chuanyi":["冷","天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。"],"ganmao":["易发","昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"],"kongtiao":["开启制暖空调","您将感到有些冷，可以适当开启制暖空调调节室内温度，以免着凉感冒。"],"wuran":["中","气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较不宜","天气较好，但考虑天气寒冷，推荐您进行各种室内运动，若在户外运动请注意保暖并做好准备活动。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}}
     * pm25 : {"area":["保定","101090201"],"pm25":[161,"2016122717"]}
     */

    private int time;
    private LifeBean life;
    private Pm25Bean pm25;
    private List<WeatherBean> weather;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public LifeBean getLife() {
        return life;
    }

    public void setLife(LifeBean life) {
        this.life = life;
    }

    public Pm25Bean getPm25() {
        return pm25;
    }

    public void setPm25(Pm25Bean pm25) {
        this.pm25 = pm25;
    }

    public List<WeatherBean> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherBean> weather) {
        this.weather = weather;
    }

    public static class LifeBean {
        /**
         * date : 2016-12-27
         * info : {"chuanyi":["冷","天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。"],"ganmao":["易发","昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"],"kongtiao":["开启制暖空调","您将感到有些冷，可以适当开启制暖空调调节室内温度，以免着凉感冒。"],"wuran":["中","气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较不宜","天气较好，但考虑天气寒冷，推荐您进行各种室内运动，若在户外运动请注意保暖并做好准备活动。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}
         */

        private String date;
        private InfoBean info;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public InfoBean getInfo() {
            return info;
        }

        public void setInfo(InfoBean info) {
            this.info = info;
        }

        public static class InfoBean {
            private List<String> chuanyi;
            private List<String> ganmao;
            private List<String> kongtiao;
            private List<String> wuran;
            private List<String> xiche;
            private List<String> yundong;
            private List<String> ziwaixian;

            public List<String> getChuanyi() {
                return chuanyi;
            }

            public void setChuanyi(List<String> chuanyi) {
                this.chuanyi = chuanyi;
            }

            public List<String> getGanmao() {
                return ganmao;
            }

            public void setGanmao(List<String> ganmao) {
                this.ganmao = ganmao;
            }

            public List<String> getKongtiao() {
                return kongtiao;
            }

            public void setKongtiao(List<String> kongtiao) {
                this.kongtiao = kongtiao;
            }

            public List<String> getWuran() {
                return wuran;
            }

            public void setWuran(List<String> wuran) {
                this.wuran = wuran;
            }

            public List<String> getXiche() {
                return xiche;
            }

            public void setXiche(List<String> xiche) {
                this.xiche = xiche;
            }

            public List<String> getYundong() {
                return yundong;
            }

            public void setYundong(List<String> yundong) {
                this.yundong = yundong;
            }

            public List<String> getZiwaixian() {
                return ziwaixian;
            }

            public void setZiwaixian(List<String> ziwaixian) {
                this.ziwaixian = ziwaixian;
            }
        }
    }

    public static class Pm25Bean {
        private List<String> area;
        private List<Integer> pm25;

        public List<String> getArea() {
            return area;
        }

        public void setArea(List<String> area) {
            this.area = area;
        }

        public List<Integer> getPm25() {
            return pm25;
        }

        public void setPm25(List<Integer> pm25) {
            this.pm25 = pm25;
        }
    }

    public static class WeatherBean {
        /**
         * date : 2016-12-27
         * info : {"day":["0","晴","3","北风","微风"],"night":["1","多云","-7","南风","微风"]}
         */

        private String date;
        private InfoBeanX info;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public InfoBeanX getInfo() {
            return info;
        }

        public void setInfo(InfoBeanX info) {
            this.info = info;
        }

        public static class InfoBeanX {
            private List<String> day;
            private List<String> night;

            public List<String> getDay() {
                return day;
            }

            public void setDay(List<String> day) {
                this.day = day;
            }

            public List<String> getNight() {
                return night;
            }

            public void setNight(List<String> night) {
                this.night = night;
            }
        }
    }
}
