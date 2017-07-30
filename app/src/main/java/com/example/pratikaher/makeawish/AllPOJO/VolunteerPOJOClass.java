package com.example.pratikaher.makeawish.AllPOJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by pratikaher on 30/07/17.
 */

public class VolunteerPOJOClass {

        @SerializedName("parent_id")
        @Expose
        private String parentId;
        @SerializedName("child_name")
        @Expose
        private String childName;
        @SerializedName("dob")
        @Expose
        private String dob;
        @SerializedName("parent_name")
        @Expose
        private String parentName;
        @SerializedName("illness")
        @Expose
        private String illness;
        @SerializedName("doctor_name")
        @Expose
        private String doctorName;
        @SerializedName("doctor_id")
        @Expose
        private String doctorId;
        @SerializedName("volunteer_id")
        @Expose
        private String volunteerId;
        @SerializedName("wish_id")
        @Expose
        private Object wishId;

        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public String getChildName() {
            return childName;
        }

        public void setChildName(String childName) {
            this.childName = childName;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getParentName() {
            return parentName;
        }

        public void setParentName(String parentName) {
            this.parentName = parentName;
        }

        public String getIllness() {
            return illness;
        }

        public void setIllness(String illness) {
            this.illness = illness;
        }

        public String getDoctorName() {
            return doctorName;
        }

        public void setDoctorName(String doctorName) {
            this.doctorName = doctorName;
        }

        public String getDoctorId() {
            return doctorId;
        }

        public void setDoctorId(String doctorId) {
            this.doctorId = doctorId;
        }

        public String getVolunteerId() {
            return volunteerId;
        }

        public void setVolunteerId(String volunteerId) {
            this.volunteerId = volunteerId;
        }

        public Object getWishId() {
            return wishId;
        }

        public void setWishId(Object wishId) {
            this.wishId = wishId;
        }

    }

