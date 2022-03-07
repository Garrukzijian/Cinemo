package com.example.cinemo;

import java.io.Serializable;
import java.util.List;

public class vdioBeans implements Serializable {


    private List<MoviesBean> movies;

    public List<MoviesBean> getMovies() {
        return movies;
    }

    public void setMovies(List<MoviesBean> movies) {
        this.movies = movies;
    }

    public static class MoviesBean implements Serializable {
        /**
         * id : 1505
         * movieCode : ["HO00004090"]
         * title_en : No Time to Die
         * title_th : พยัคฆ์ร้ายฝ่าเวลามรณะ
         * rating : น13+
         * rating_id : 2
         * duration : 164
         * release_date : 2021-10-07
         * sneak_date : 2020-11-26
         * synopsis_th : แดเนียล เคร็ก กลับมารับบท เจมส์ บอนด์ เป็นครั้งที่ 5 ในภาพยนตร์ James Bond ซึ่งเป็นภาคที่ 25 โดยใช้ชื่อว่า No Time To Die (007 พยัคฆ์ร้ายฝ่าเวลามรณะ) ภาพยนตร์กำกับโดย แครี่ โจจิ ฟูกุนากะ

         ใน No Time To Die เจมส์ บอนด์กำลังสนุกไปกับชีวิตอันเงียบสงบในจาไมก้า แต่ช่วงเวลาพักผ่อนนั้นก็เป็นเพียงช่วงเวลาสั้นๆ เพราะเฟลิกซ์ เลเทอร์ เพื่อนเก่าจากซีไอเอ มาขอให้เขาช่วยทำงาน เป้าหมายคือช่วยชีวิตนักวิทยาศาสตร์ที่ถูกลักพาตัวไป ซึ่งเหตุการณ์นี้ดูเลวร้ายกว่าที่คิดไว้ บอนด์ต้องเข้าไปเผชิญกับศัตรูลึกลับที่ใช้เทคโนโลยีสมัยใหม่สุดอันตรายเป็นอาวุธ

         นอกจาก แดเนียล เคร็ก แล้ว ภาพยนตร์ No Time To Die ยังได้เจ้าของรางวัลออสการ์อย่างรามี มาเลค มาร่วมงานด้วย รวมถึงนักแสดงอีกมากมาย อาทิ เลอา เซย์ดูว์, ลาชาน่า ลินช์, เบน วิชอว์, นาโอมิ แฮร์ริส, เจฟฟรี่ย์ ไรท์, คริสทอฟ วอลทซ์ และเรล์ฟ ไฟนส์ ในบท “เอ็ม” ร่วมด้วย รอรี่ คินเนียร์ และ อนา เดอ อาร์มัส
         * synopsis_en : In No Time To Die, Bond has left active service and is enjoying a tranquil life in Jamaica. His peace is short-lived when his old friend Felix Leiter from the CIA turns up asking for help. The mission to rescue a kidnapped scientist turns out to be far more treacherous than expected, leading Bond onto the trail of a mysterious villain armed with dangerous new technology.
         * director : Cary Joji Fukunaga
         * actor : Daniel Craig/Léa Seydoux/Ana de Armas/Lashana Lynch/Rami Malek
         * genre : Action/Adventure/Thriller
         * poster_ori : /uploads/movie/2782/thumb_2782.jpg
         * poster_url : https://cdn.majorcineplex.com/uploads/movie/2782/thumb_2782.jpg?v=202110071647
         * trailer : https://cdn.majorcineplex.com/embed/6304
         * tr_ios : http://27.254.80.209:1935/media/_definst_/mp4:major/trailer/6304/6304_720.mp4/playlist.m3u8
         * tr_hd : rtsp://27.254.80.209:1935/media/_definst_/mp4:major/trailer/6304/6304_720.mp4
         * tr_sd : rtsp://27.254.80.209:1935/media/_definst_/mp4:major/trailer/6304/6304_360.mp4
         * tr_mp4 : https://cdn.majorcineplex.com/uploads/trailer/rawvideo/6304/6304.mp4
         * priority : 99999999
         * now_showing : 1
         * advance_ticket : 0
         * date_update : 2021-10-06 18:00:08
         * show_buyticket : 1
         * trailer_cms_id : 6304
         * trailer_ivx_key : 1763409
         */

        private int id;
        private String title_en;
        private String title_th;
        private String rating;
        private int rating_id;
        private int duration;
        private String release_date;
        private String sneak_date;
        private String synopsis_th;
        private String synopsis_en;
        private String director;
        private String actor;
        private String genre;
        private String poster_ori;
        private String poster_url;
        private String trailer;
        private String tr_ios;
        private String tr_hd;
        private String tr_sd;
        private String tr_mp4;
        private String priority;
        private String now_showing;
        private String advance_ticket;
        private String date_update;
        private String show_buyticket;
        private String trailer_cms_id;
        private String trailer_ivx_key;
        private List<String> movieCode;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle_en() {
            return title_en;
        }

        public void setTitle_en(String title_en) {
            this.title_en = title_en;
        }

        public String getTitle_th() {
            return title_th;
        }

        public void setTitle_th(String title_th) {
            this.title_th = title_th;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public int getRating_id() {
            return rating_id;
        }

        public void setRating_id(int rating_id) {
            this.rating_id = rating_id;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public String getRelease_date() {
            return release_date;
        }

        public void setRelease_date(String release_date) {
            this.release_date = release_date;
        }

        public String getSneak_date() {
            return sneak_date;
        }

        public void setSneak_date(String sneak_date) {
            this.sneak_date = sneak_date;
        }

        public String getSynopsis_th() {
            return synopsis_th;
        }

        public void setSynopsis_th(String synopsis_th) {
            this.synopsis_th = synopsis_th;
        }

        public String getSynopsis_en() {
            return synopsis_en;
        }

        public void setSynopsis_en(String synopsis_en) {
            this.synopsis_en = synopsis_en;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public String getActor() {
            return actor;
        }

        public void setActor(String actor) {
            this.actor = actor;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getPoster_ori() {
            return poster_ori;
        }

        public void setPoster_ori(String poster_ori) {
            this.poster_ori = poster_ori;
        }

        public String getPoster_url() {
            return poster_url;
        }

        public void setPoster_url(String poster_url) {
            this.poster_url = poster_url;
        }

        public String getTrailer() {
            return trailer;
        }

        public void setTrailer(String trailer) {
            this.trailer = trailer;
        }

        public String getTr_ios() {
            return tr_ios;
        }

        public void setTr_ios(String tr_ios) {
            this.tr_ios = tr_ios;
        }

        public String getTr_hd() {
            return tr_hd;
        }

        public void setTr_hd(String tr_hd) {
            this.tr_hd = tr_hd;
        }

        public String getTr_sd() {
            return tr_sd;
        }

        public void setTr_sd(String tr_sd) {
            this.tr_sd = tr_sd;
        }

        public String getTr_mp4() {
            return tr_mp4;
        }

        public void setTr_mp4(String tr_mp4) {
            this.tr_mp4 = tr_mp4;
        }

        public String getPriority() {
            return priority;
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }

        public String getNow_showing() {
            return now_showing;
        }

        public void setNow_showing(String now_showing) {
            this.now_showing = now_showing;
        }

        public String getAdvance_ticket() {
            return advance_ticket;
        }

        public void setAdvance_ticket(String advance_ticket) {
            this.advance_ticket = advance_ticket;
        }

        public String getDate_update() {
            return date_update;
        }

        public void setDate_update(String date_update) {
            this.date_update = date_update;
        }

        public String getShow_buyticket() {
            return show_buyticket;
        }

        public void setShow_buyticket(String show_buyticket) {
            this.show_buyticket = show_buyticket;
        }

        public String getTrailer_cms_id() {
            return trailer_cms_id;
        }

        public void setTrailer_cms_id(String trailer_cms_id) {
            this.trailer_cms_id = trailer_cms_id;
        }

        public String getTrailer_ivx_key() {
            return trailer_ivx_key;
        }

        public void setTrailer_ivx_key(String trailer_ivx_key) {
            this.trailer_ivx_key = trailer_ivx_key;
        }

        public List<String> getMovieCode() {
            return movieCode;
        }

        public void setMovieCode(List<String> movieCode) {
            this.movieCode = movieCode;
        }
    }
}