package org.apache.skywalking.apm.plugin.solr.commons;

import org.apache.skywalking.apm.network.trace.component.Component;

public class SolrComponent {
    public static final Component SOLR = new Component() {
        @Override
        public int getId() {
            return 64;
        }

        @Override
        public String getName() {
            return "SOLR";
        }
    };
}
