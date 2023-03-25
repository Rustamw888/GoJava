package Lesson_26.part_4;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class User extends Person implements Externalizable {

  private int userId;
  private double userPhone;

  public User() {}

  public User(String userFirstName, String userLastName, int userId, double userPhone) {
    super(userFirstName, userLastName);
    this.userId = userId;
    this.userPhone = userPhone;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public double getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(double userPhone) {
    this.userPhone = userPhone;
  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeInt(this.getUserId());
    out.writeDouble(this.getUserPhone());
    out.writeUTF(this.getUserFirstName());
    out.writeUTF(this.getUserFirstName());
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException {
    this.setUserId(in.readInt());
    this.setUserPhone(in.readDouble());
    this.setUserFirstName(in.readUTF());
    this.setUserLastName(in.readUTF());
  }
}
