package com.infobip.kafkistry.webapp.url

import com.infobip.kafkistry.model.KafkaClusterIdentifier

class ClustersUrls(base: String) : BaseUrls() {

    companion object {
        const val CLUSTERS = "/clusters"
        const val CLUSTERS_ADD = "/add"
        const val CLUSTERS_EDIT = "/edit"
        const val CLUSTERS_EDIT_ON_BRANCH = "/edit-on-branch"
        const val CLUSTERS_INSPECT = "/inspect"
        const val CLUSTERS_REMOVE = "/remove"
        const val CLUSTERS_BALANCE = "/balance"
        const val CLUSTERS_INCREMENTAL_BALANCING = "/incremental-balancing"
        const val CLUSTERS_INCREMENTAL_BALANCING_SUGGESTION = "/incremental-balancing/suggestion"
        const val CLUSTERS_RESOURCES = "/resources"
        const val CLUSTERS_ISSUES = "/issues"
        const val CLUSTERS_DRY_RUN_INSPECT = "/dry-run-inspect"
    }

    private val showClusters = Url(base)
    private val showAddCluster = Url("$base$CLUSTERS_ADD")
    private val showEditCluster = Url("$base$CLUSTERS_EDIT", listOf("clusterIdentifier"))
    private val showEditClusterOnBranch = Url("$base$CLUSTERS_EDIT_ON_BRANCH", listOf("clusterIdentifier", "branch"))
    private val showCluster = Url("$base$CLUSTERS_INSPECT", listOf("clusterIdentifier"))
    private val showRemoveCluster = Url("$base$CLUSTERS_REMOVE", listOf("clusterIdentifier"))
    private val showClusterBalance = Url("$base$CLUSTERS_BALANCE", listOf("clusterIdentifier"))
    private val showIncrementalBalancing = Url("$base$CLUSTERS_INCREMENTAL_BALANCING", listOf("clusterIdentifier"))
    private val showIncrementalBalancingSuggestion = Url("$base$CLUSTERS_INCREMENTAL_BALANCING_SUGGESTION", listOf("clusterIdentifier"))
    private val showClusterResources = Url("$base$CLUSTERS_RESOURCES", listOf("clusterIdentifier"))
    private val showClusterIssues = Url("$base$CLUSTERS_ISSUES", listOf("clusterIdentifier"))
    private val showClusterDryRunInspect = Url("$base$CLUSTERS_DRY_RUN_INSPECT")

    fun showClusters() = showClusters.render()

    fun showAddCluster() = showAddCluster.render()

    fun showEditCluster(
        clusterIdentifier: KafkaClusterIdentifier
    ) = showEditCluster.render("clusterIdentifier" to clusterIdentifier)

    fun showEditClusterOnBranch(
        clusterIdentifier: KafkaClusterIdentifier,
        branch: String
    ) = showEditClusterOnBranch.render("clusterIdentifier" to clusterIdentifier, "branch" to branch)

    fun showCluster(
            clusterIdentifier: KafkaClusterIdentifier
    ) = showCluster.render("clusterIdentifier" to clusterIdentifier)

    fun showRemoveCluster(
            clusterIdentifier: KafkaClusterIdentifier
    ) = showRemoveCluster.render("clusterIdentifier" to clusterIdentifier)

    fun showClusterBalance(
            clusterIdentifier: KafkaClusterIdentifier
    ) = showClusterBalance.render("clusterIdentifier" to clusterIdentifier)

    fun showIncrementalBalancing(
            clusterIdentifier: KafkaClusterIdentifier
    ) = showIncrementalBalancing.render("clusterIdentifier" to clusterIdentifier)

    fun showIncrementalBalancingSuggestion(
            clusterIdentifier: KafkaClusterIdentifier
    ) = showIncrementalBalancingSuggestion.render("clusterIdentifier" to clusterIdentifier)

    fun showClusterResources(
        clusterIdentifier: KafkaClusterIdentifier
    ) = showClusterResources.render("clusterIdentifier" to clusterIdentifier)

    fun showClusterIssues(
        clusterIdentifier: KafkaClusterIdentifier
    ) = showClusterIssues.render("clusterIdentifier" to clusterIdentifier)

    fun showClusterDryRunInspect() = showClusterDryRunInspect.render()

}