package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class locdata
{
    @Id
        private String time;
        private int id;
        private float longitude;
        private float latitude;
         
        public locdata(String time, int id, float longitude, float latitude) {
            super();
            this.time = time;
            this.id = id;
            this.longitude = longitude;
            this.latitude = latitude;
        }
        
                
        public locdata() {
            super();
        }
    
        public String gettime() {
            return time;
        }
        public void settime(String time) {
            this.time = time;
        }

        public int getid() {
            return id;
        }
        public void setid(int id) {
            this.id = id;
        }
        public float getlongitude() {
            return longitude;
        }
        public void setlongitude(float longitude) {
            this.longitude = longitude;
        }
        public float getlatitude() {
            return latitude;
        }
        public void setlatitude(float latitude) {
            this.latitude = latitude;
        }
        
        
        @Override
        public String toString() {
            return "locdata [time=" + time + ", id=" + id + ", longitude=" + longitude + ", latitude=" + latitude + "]";
        }
        
}
