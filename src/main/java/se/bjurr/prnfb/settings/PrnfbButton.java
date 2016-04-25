package se.bjurr.prnfb.settings;

import static java.util.UUID.randomUUID;

import java.util.UUID;

public class PrnfbButton implements HasUuid {

 private final UUID uuid;
 private final String title;
 private final USER_LEVEL userLevel;

 public PrnfbButton(String title, USER_LEVEL userLevel) {
  this.uuid = randomUUID();
  this.title = title;
  this.userLevel = userLevel;
 }

 public PrnfbButton(UUID uuid, String title, USER_LEVEL userLevel) {
  this.uuid = uuid;
  this.title = title;
  this.userLevel = userLevel;
 }

 public String getTitle() {
  return title;
 }

 public USER_LEVEL getUserLevel() {
  return userLevel;
 }

 @Override
 public UUID getUuid() {
  return uuid;
 }

 @Override
 public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + ((title == null) ? 0 : title.hashCode());
  result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
  result = prime * result + ((userLevel == null) ? 0 : userLevel.hashCode());
  return result;
 }

 @Override
 public boolean equals(Object obj) {
  if (this == obj) {
   return true;
  }
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) {
   return false;
  }
  PrnfbButton other = (PrnfbButton) obj;
  if (title == null) {
   if (other.title != null) {
    return false;
   }
  } else if (!title.equals(other.title)) {
   return false;
  }
  if (uuid == null) {
   if (other.uuid != null) {
    return false;
   }
  } else if (!uuid.equals(other.uuid)) {
   return false;
  }
  if (userLevel != other.userLevel) {
   return false;
  }
  return true;
 }

 @Override
 public String toString() {
  return "PrnfbButton [uuid=" + uuid + ", title=" + title + ", visibility=" + userLevel + "]";
 }

}
