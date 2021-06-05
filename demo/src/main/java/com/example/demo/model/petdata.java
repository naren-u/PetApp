package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class petdata
{
    @Id
        private int id;
        private String name;
        private String owner;
        private String address;
        private String accesstype;
        private String datapermission;


        public petdata(int id, String name, String owner, String address, String accesstype, String datapermission) {
            super();
            this.id = id;
            this.name = name;
            this.owner = owner;
            this.address = address; 
            this.accesstype = accesstype;
            this.datapermission = datapermission;
        }
        
                
        public petdata() {
            super();
        }
    
        
        public int getid() {
            return id;
        }
        public void setid(int id) {
            this.id = id;
        }
        public String getname() {
            return name;
        }
        public void setname(String name) {
            this.name = name;
        }
        public String getowner() {
            return owner;
        }
        public void setowner(String owner) {
            this.owner = owner;
        }
        public String getaddress() {
            return address;
        }
        public void setaddress(String address) {
            this.address = address;
        }
        public String getaccesstype() {
            return accesstype;
        }
        public void setaccesstype(String accesstype) {
            this.accesstype = accesstype;
        }
        public String getdatapermission() {
            return datapermission;
        }
        public void setdatapermission(String datapermission) {
            this.datapermission = datapermission;
        }
        

        @Override
        public String toString() {
            return "petdata [id=" + id + ", name=" + name + ", owner=" + owner + ", address=" + address + ", accesstype=" + accesstype + ", datapermission=" + datapermission + "]";
        }
        
}
