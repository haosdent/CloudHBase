package me.haosdent.cloud_hbase.sdk;

public class Resp {
  public long version;
  public long rid;
  public String gid;
  public String act;
  public String cmd;
  public String dataStr;

  public Resp(long rid, String gid, String act, String cmd, String dataStr){
    this.rid = rid;
    this.gid = gid;
    this.act = act;
    this.cmd = cmd;
    this.dataStr = dataStr;
  }
}
