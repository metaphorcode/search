/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.solr.hadoop;

public enum SolrCounters {

  DOCUMENTS_WRITTEN (getClassName(SolrReducer.class) 
      + ": Number of documents processed"),

  BATCHES_WRITTEN (getClassName(SolrReducer.class) 
      + ": Number of document batches processed"),

  BATCH_WRITE_TIME (getClassName(SolrReducer.class) 
      + ": Total time spent by all reducers writing document batches"),

  PHYSICAL_REDUCER_MERGE_TIME (getClassName(SolrReducer.class)
      + ": Total time spent by all reducers performing physical merges"),
  
  LOGICAL_TREE_MERGE_TIME (getClassName(TreeMergeOutputFormat.class)
      + ": Total time spent by all mapper-only tasks performing logical tree merges merges"),

  PHYSICAL_TREE_MERGE_TIME (getClassName(TreeMergeOutputFormat.class)
      + ": Total time spent by all mapper-only tasks performing physical tree merges");

  private final String name;
  
  private SolrCounters(String name) {
    this.name = name;
  }
  
  public String toString() {
    return name;
  }
  
  private static String getClassName(Class clazz) {
    return Utils.getShortClassName(clazz);
  }

}
