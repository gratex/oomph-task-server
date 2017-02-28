/**
 *
 */
package com.gratex.oomph.task.utils;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author jkovalux
 *
 */
public class VMArgs
{

  private Map<String, String> args = new LinkedHashMap<>();

  public VMArgs(String vmargs)
  {
    put(vmargs);
  }

  public void put(String vmargs)
  {
    String[] split = vmargs.split("\\s*-");
    Map<String, String> argsMap = Arrays.asList(split).stream().filter(e -> e.trim().length() > 0).map(e -> e.split("=", 2)).collect(LinkedHashMap::new,
        (m, v) -> m.put(v[0], v.length > 1 ? v[1] : null), LinkedHashMap::putAll);
    args.putAll(argsMap);
  }

  public String getArg(String key)
  {
    return args.get(key);
  }

  @Override
  public String toString()
  {
    String result = args.entrySet().stream().map(e -> {
      StringBuilder sb = new StringBuilder();
      sb.append(e.getKey());
      if (e.getValue() != null)
      {
        sb.append("=").append(e.getValue());
      }
      return sb.toString();
    }).collect(Collectors.joining(" \n-"));
    return "-" + result;
  }

  public static void main(String[] args)
  {
    VMArgs vmArgs = new VMArgs("-Dasdas=asd=as -asda          -Dasdasdasd asdasd -asdadadasdas -XMMs=5Gb");

    vmArgs.put("x=ads");
    System.out.println(vmArgs.toString());

    vmArgs = new VMArgs("X=Y");

    vmArgs.put("X=X");
    System.out.println(vmArgs.toString());
  }
}
